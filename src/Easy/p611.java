package Easy;

import java.util.Scanner;

public class p611 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		while (!line.isEmpty()) {
			Scanner anoNombre = new Scanner(line);
			anoNombre.useDelimiter("\\s+");
			int ano = anoNombre.nextInt();
			anoNombre.close();
			String nVeces = scanner.nextLine();
			String obraSir = null;
			int anoObra;
			int anoObraSir = 10001;

			for(int i = 0; i < Integer.parseInt(nVeces); i++) {
				line = scanner.nextLine();
				Scanner Comparar = new Scanner(line);
				anoObra = Comparar.nextInt();
				if( anoObra >= ano && anoObra < anoObraSir) {
					obraSir = line;
					anoObraSir = anoObra;
				}

			}
			if(obraSir == null)
				System.out.println("NINGUNA");
			else
				System.out.println(obraSir);
			
			line = scanner.nextLine();
		}
		scanner.close();
	}
}
