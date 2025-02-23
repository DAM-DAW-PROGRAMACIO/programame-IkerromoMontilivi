	package Easy;
	
	import java.util.Scanner;
	
	public class p245 {
	
		public static void main(String[] args) throws Exception {
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			
			while (!line.equals("0")) {
				boolean dalton = true;
				int nHermanos = Integer.parseInt(line);
				if(nHermanos > 0) {
					scanner.useDelimiter("\\s+");
					int numeros[] = new int[nHermanos];
					
					for (int i = 0; i < nHermanos; i++)
						numeros[i] = scanner.nextInt();
					
					for(int i = 0; i < nHermanos-1; i++)
						if(numeros[i] >= numeros[i+1]) {
							dalton = false;
							break;
						}
				}
				else
					dalton = false;
				
				if(dalton)
					System.out.println("DALTON");
				else
					System.out.println("DESCONOCIDOS");
				
				scanner.nextLine();
				line = scanner.nextLine();
			}
			scanner.close();
		}
	}
