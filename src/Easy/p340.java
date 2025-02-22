package Easy;

import java.util.Scanner;

public class p340 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		String line;
			
		for(int i =0; i < nVeces ; i++) {
			scanner.useDelimiter("\\s+");
			int lineas = scanner.nextInt();
			int columnas = scanner.nextInt();
			long palos = 4 + (3 * columnas - 3) + (lineas-1) * (3 + (2 * columnas - 2));;
			System.out.println(palos);
		}
		scanner.close();
	}
}
