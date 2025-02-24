package Easy;

import java.util.Scanner;

public class p409 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		
		for(int i = 0; i < nVeces; i++) {
			scanner.useDelimiter("\\s+");
			int nPP = scanner.nextInt();
			int nPersones = scanner.nextInt();
			int[] altures = new int[nPersones];
			double mitja = 0;
			
			//Mal, hacer grupos de 15 en 15 x piso
			for(int j = 0; j < nPersones; j++) {
				altures[j] = scanner.nextInt();
				mitja += altures[j];
			}
			mitja = mitja /nPersones;
			
			int aptas = 0;
			for(int j=0; j < nPersones; j++) {
				if(altures[j] < mitja+7.5 && altures[j] > mitja-7.5) {
					aptas++;
				}
			}
			
			for(int j = aptas; j >= nPP; j--) {
				if(j%nPP == 0) {
					System.out.println(j/nPP);
					break;
				}
			}
		}
		scanner.close();
	}
}
