package Easy;

import java.util.Scanner;

import java.util.Arrays;
public class p409 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		
		for(int i = 0; i < nVeces; i++) {
			scanner.useDelimiter("\\s+");
			int nPP = scanner.nextInt();
			int nPersones = scanner.nextInt();
			int[] alturas = new int[nPersones];
			for(int j = 0; j <nPersones ; j++)
				alturas[j] = scanner.nextInt();
			
			Arrays.sort(alturas);
			int j = 0;
			int cont = 0;
			while(j < nPersones - (nPP -1)) {
				if((alturas[j + (nPP -1)] - alturas[j] <= 15)) {
					cont++;
					j += nPP;
				}
				
				else {
					j++;
				}
			}
			
			
			
			System.out.println(cont);
		}
		scanner.close();
	}
}