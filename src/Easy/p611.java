package Easy;

import java.util.Scanner;

public class p611 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		while (!line.isEmpty()) {
			int ano = Integer.parseInt(line);
			scanner.nextLine();

			long nVeces = scanner.nextLong();
			int anoObraSir = 10001;
			String obraSir = null;
			int cont = 0;
			if(nVeces > 0) {
				for(int i = 0; i < nVeces; i++) {
					int anoObra = scanner.nextInt();
					String obra = scanner.nextLine().trim();
					if(anoObra >= ano)
						cont++;
					if( anoObra >= ano && anoObra < anoObraSir) {
						obraSir = obra;
						anoObraSir = anoObra;
						
					}

				}
			}
			
			if(obraSir == null)
				System.out.println("NINGUNA");
			else if(cont == nVeces) {
				System.out.println("TODAS");
			}
			else
				System.out.println(obraSir);
			if(scanner.hasNext())
				line = scanner.next();
		}
		scanner.close();
	}
}
