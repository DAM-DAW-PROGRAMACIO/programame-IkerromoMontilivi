package Easy;

import java.util.Scanner;

public class p345 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		String line;
			
		for(int i =0; i < nVeces ; i++) {
			scanner.useDelimiter("\\s+");
			int matriz[][] = new int[9][9];
			boolean posible = true;
			for(int j = 0; j < 9; j++) {
				for(int k = 0; k < 9; k++) {
					matriz[j][k] = scanner.nextInt();
				}	
			}
			
			//Comprobar filas
			if(posible) {
				for(int j = 0; j < 9; j++) {
					int repes[] = new int[9];
					for(int k = 0; k < 9; k++) {
						repes[matriz[j][k]-1] ++;
					}	
					for(int k = 0; k < 9; k++) {
						if (repes[k] != 1)
							posible = false;
					}					
				}	
			}
			
			//Comprobar columnas
			if(posible) {
				for(int j = 0; j < 9; j++) {
					int repes[] = new int[9];
					for(int k = 0; k < 9; k++) {
						repes[matriz[k][j]-1] ++;
					}	
					for(int k = 0; k < 9; k++) {
						if (repes[k] != 1)
							posible = false;
					}					
				}	
			}
			
			//Comprobar regiones
			if(posible) {
				for(int r = 0; r <= 2; r++) {
					for(int l = 0; l <= 2; l++) {
						int repes[] = new int[9];
						for(int j = (0 + 3 * r); j < (3 + 3 * r); j++) {
							for(int k = (0 + 3 * l); k < (3 + 3*l); k++) {
								repes[matriz[j][k]-1] ++;
							}
						}
						for(int k = 0; k < 9; k++) {
							if (repes[k] != 1)
								posible = false;
						}	
					}
					
				}
			}
		if(posible)
			System.out.println("SI");
		else
			System.out.println("NO");
		}
		scanner.close();
	}
		
}


