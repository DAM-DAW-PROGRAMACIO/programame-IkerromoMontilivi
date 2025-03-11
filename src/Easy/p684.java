package Easy;

import java.util.Arrays;
import java.util.Scanner;
public class p684 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		while (!line.equals("0")) {
			int n = Integer.parseInt(line);
			if(n == 1)
				System.out.println("2 3 4 5 6 7");
			else {
				int nRing;
				int suma = 1;
				int i = 0;
				while(true) {
					i++;
					if(n > suma&& n <= (suma + i*6)) {
						nRing = i;
						break;
					}
					suma += i*6;
				}
				
				Ring ring = new Ring(nRing, n, suma);
				Ring ringPrev = new Ring(nRing-1, suma - (i)*6);
				Ring ringNext = new Ring(nRing+1, suma + i*6);
				
				Integer[] vecinos = new Integer[6];
				
				//Si el numero cau en un dels vertex, exemples basats en n = 8
				if(ring.y() == 0) {
					//Vertex del ring anterior i posterior, ex: 2 i 20
					vecinos[0] = ringNext.sides()[ring.x()][0];
					vecinos[1] = ringPrev.sides()[ring.x()][0];
					
					//Numeros dels costats (if si esta al principi que miri el ultim costat 
					//en comptes de indexOutOfRange ex: 19 i 9
					if(ring.x()-1 == -1)
						vecinos[2] = ring.sides()[5][nRing-1];
					else
						vecinos[2] = ring.sides()[ring.x()-1][nRing-1];
					
					//Si el de la dreta esta al següent costat
					if(ring.y()+1 == nRing)
						//Si el següent costat ha de ser el 0
						if(ring.x()+1 == 6)
							vecinos[3] = ring.sides()[0][0];
						else
							vecinos[3] = ring.sides()[ring.x()+1][0];
					else
						vecinos[3] = ring.sides()[ring.x()][1];
					
					//Numeros del costats del vertex del Next Ring,
					//Comprovar que no estigui a -1 un altre cop
					//ex: 37 i 21
					if(ring.x()-1 == -1)
						vecinos[4] = ringNext.sides()[5][nRing];
					else
						vecinos[4] = ringNext.sides()[ring.x()-1][nRing];
					
						vecinos[5] = ringNext.sides()[ring.x()][1];
				
				}
				
				
				//Si esta en un costat normal
				else {
					//Numeros dels costats
					vecinos[0] = ring.sides()[ring.x()][ring.y()-1];
					
					//El numero de la dreta potser necessita el del costat següent
					if(ring.y()+1 == nRing) {
						//Potser que el següent costat sigui el costat 0
						if(ring.x()+1 == 6)
							vecinos[1] = ring.sides()[0][0];
						else
							vecinos[1] = ring.sides()[ring.x()+1][0];
					}
					//Si no el necessita
					else
						vecinos[1] = ring.sides()[ring.x()][ring.y()+1];
					
					//Els 2 numeros del ring Prev
					vecinos[2] = ringPrev.sides()[ring.x()][ring.y()-1];
					
					//Si el ring Prev no te y a la y del numero, passar al següent side
					//del ring Prev
					if(ring.y() == nRing-1) {
						//Un altre cop tenir en compte si es el ultim costat
						if(ring.x()+1 == 6)
							vecinos[3] = ringPrev.sides()[0][0];
						else
							vecinos[3] = ringPrev.sides()[ring.x()+1][0];
					}
					else {
						vecinos[3] = ringPrev.sides()[ring.x()][ring.y()];
					}
					
					//Els 2 numeros del ring Next
					vecinos[4] = ringNext.sides()[ring.x()][ring.y()];
					vecinos[5] = ringNext.sides()[ring.x()][ring.y()+1];
				}
				
				Arrays.sort(vecinos);
				System.out.println(vecinos[0] + " " + vecinos[1] + " " + vecinos[2] + " " + vecinos[3] + " " +  + vecinos[4] + " " +  + vecinos[5]);
			}
			line = scanner.next();
		}
		scanner.close();
	}
}

//Classe per guargar l'anell del panell amb els seus costats en una matriu de 6xN
class Ring {
	private Integer[][] sides;
	private Integer numero;
	private Integer x;
	private Integer y;
	private int suma;
	public Ring(int nr,int n, int s) {
		sides = new Integer[6][nr];
		numero = n;
		
		//Suma comença a 2 per saltar el ring 0 que es nomes el 1 i per començar al 
		//primer numero de cada ring
		suma = s+1;
		
		for(int i = 0; i<6;i++) {
			for(int j = 0; j < nr; j++) {
				if(suma == numero) {
					x = i;
					y = j;
				}			
				sides[i][j] = suma;
				suma++;
			}
		}
	
	}
	
	//Constructor de rings sense numero, per al Next i el Prev
	public Ring(int nr, int s) {
		
		//En cas que el ringPrev sea 0; que tots els costats siguin 1
		if(nr == 0) {
			sides = new Integer[][]{
			    {1},
			    {1},
			    {1},
			    {1},
			    {1},
			    {1}
			};
		}
		else {
			sides = new Integer[6][nr];

			suma = s+1;
			for(int j = 0; j < nr; j++) {
				sides[0][j] = suma;
				sides[1][j] = suma+nr;
				sides[2][j] = suma+nr*2;
				sides[3][j] = suma+nr*3;
				sides[4][j] = suma+nr*4;
				sides[5][j] = suma+nr*5;
				suma++;
			}
		}	
	}
	
	
	public int x(){
		return x;
	}
	public int y() {
		return y;
	}
	public Integer[][] sides(){
		return sides;
	}
}