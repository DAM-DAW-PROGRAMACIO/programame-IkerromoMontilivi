package Easy;

import java.util.Scanner;

public class p245 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		while (!line.equals("0")) {
			boolean dalton = true;
			boolean daltonR = true;
			int nHermanos = Integer.parseInt(line);

			scanner.useDelimiter("\\s+");
			int numeros[] = new int[nHermanos];
			
			for (int i = 0; i < nHermanos; i++)
				numeros[i] = scanner.nextInt();
			scanner.nextLine();
			for(int i = 0; i < nHermanos-1; i++) {
				if(numeros[i] >= numeros[i+1]) {
					dalton = false;
					break;
				}	
			}
			
			for(int i = 0; i < nHermanos - 1; i++) {
				if(numeros[i] <= numeros[i+1]) {
					daltonR = false;
					break;
				}	
			}


			if(dalton || daltonR)
				System.out.println("DALTON");
			else
				System.out.println("DESCONOCIDOS");
			line = scanner.nextLine();
			
		}
		scanner.close();
	}
}
