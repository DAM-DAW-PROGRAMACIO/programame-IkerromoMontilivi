package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class p681 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);	
		int nVeces;
		while(sc.hasNext()) 
		{ 
			nVeces = sc.nextInt();
			if(nVeces > 0) {
				TreeSet<Integer> numeros = new TreeSet<Integer>();
				int n = sc.nextInt();
				long suma = n;
				numeros.add(n);
				TreeSet<Integer> huecos = new TreeSet<>();
				huecos.add(n+1);
				huecos.add(n-1);
				huecos.add(0);
				for(int i = 0; i < nVeces-1; i++) {
					n = sc.nextInt();
					if(!numeros.add(n)) {
						int menor = -1;
						for(int hueco : huecos) {
							if(hueco < n && hueco > menor) {
								menor = hueco;
							}
							if(menor == n)
								break;
						}
						n = menor;
					}
					if(huecos.contains(n) && n != 0)
						huecos.remove(Integer.valueOf(n));
					if(!numeros.contains(n+1) && !huecos.contains(n+1))
						huecos.add(n+1);
					if(n-1 > -1 && !numeros.contains(n-1) && !huecos.contains(n-1))
						huecos.add(n-1);
					suma += n;
				}

				System.out.println(suma);
			}
		}
		sc.close();
	}
}


