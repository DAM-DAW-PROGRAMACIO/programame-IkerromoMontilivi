package Easy;


import java.util.Arrays;
import java.util.Scanner;



public class p681_2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);	
		int nVeces;
		while(sc.hasNext()) 
		{ 
			nVeces = sc.nextInt();
			if(nVeces > 0) {
				int[] numeros = new int[nVeces];
				for(int i = 0; i < nVeces; i++) 
				{
					numeros[i] = sc.nextInt();
				}
				Arrays.sort(numeros);
				long suma = numeros[nVeces-1];
				for(int i = nVeces-2; i >= 0; i--) {
					if(numeros[i] >= numeros[i+1]) {
						if(numeros[i + 1] == 0)
							break;
						if(numeros[i] >= numeros[i +1])
							numeros[i] = numeros[i+1]-1;
					}
					suma += numeros[i];
				}

				System.out.println(suma);
			}
		}
		sc.close();
	}
}


