package Easy;

import java.util.Scanner;
import java.util.Arrays;

public class p681 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);	
		int nVeces;
		while(sc.hasNextInt()) 
		{ 
			nVeces = sc.nextInt();
			if(nVeces > 0) {
				int[] numeros = new int[nVeces];
				for(int i = 0; i < nVeces; i++) 
				{
					numeros[i] = sc.nextInt();
				}
				Arrays.sort(numeros);
				int suma = numeros[nVeces-1];
				for(int i = nVeces-2; i >= 0; i--) {
					if(numeros[i] >= numeros[i+1]) {
						while(numeros[i] >= numeros[i +1] && numeros[i] > 0)
							numeros[i]--;
						if(numeros[i] == 0)
							break;
					}
					suma += numeros[i];
				}

				System.out.println(suma);
			}
		}
		sc.close();
	}
}


