package Easy;

import java.util.Scanner;

public class p219 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String nVeces = scanner.nextLine();
		for(int i = 0; i < Integer.parseInt(nVeces); i++) {
			int nDecimos = scanner.nextInt();
			scanner.useDelimiter("\\s+");
			int cont = 0;
			for(int j = 0; j < nDecimos; j++) {
				int numero = scanner.nextInt();
				if(numero%2 == 0)
					cont++;
			}
			System.out.println(cont);
		}
		scanner.close();
	}
}
