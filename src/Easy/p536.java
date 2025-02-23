package Easy;

import java.util.Scanner;
import java.util.ArrayList;

public class p536 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String nVeces = scanner.nextLine();
		
		while (true) {	
			if (nVeces.isEmpty())
			    break;

			Huerto huertos[] = new Huerto[Integer.parseInt(nVeces)];
			for(int i = 0; i < Integer.parseInt(nVeces); i++) {
				String line = scanner.nextLine();
				Scanner lineaActual = new Scanner(line);
				
				lineaActual.useDelimiter("\\s+");
				int tamano = lineaActual.nextInt();
				int abono = lineaActual.nextInt();
				int agua = lineaActual.nextInt();
				int distancia = lineaActual.nextInt();
				StringBuilder nombre = new StringBuilder();
				while(lineaActual.hasNext()) {
					nombre.append(lineaActual.next()).append(" ");
				}
				String nombreString = nombre.toString().trim();

				huertos[i] = new Huerto(nombreString, tamano, agua, abono, distancia);
				lineaActual.close();
			}
			Huerto max = huertos[0];
			for(int i = 1; i < Integer.parseInt(nVeces); i++)
			{
				if(huertos[i].Tamano() > max.Tamano()) {
					max = huertos[i];
				}
				else if (huertos[i].Tamano() == max.Tamano()) {
					if(huertos[i].Agua() < max.Agua()) {
						max = huertos[i];
					}
					else if(huertos[i].Agua() == max.Agua()) {
						if(huertos[i].Distancia() < max.Distancia())
							max = huertos[i];
						else if(huertos[i].Distancia() == max.Distancia())
							if(huertos[i].Abono() < max.Abono())
								max = huertos[i];
					}
				}
				
			}
			
			System.out.println(max.Nombre());
			nVeces = scanner.nextLine();
		}
	
		scanner.close();
		
	}
}

class Huerto {
	String nombre;;
	int tamano;
	int agua;
	int abono;
	int distancia;
	
	public Huerto(String nombre, int tamano, int agua, int abono, int distancia) {
		this.nombre = nombre;
		this.tamano = tamano;
		this.agua = agua;
		this.abono = abono;
		this.distancia = distancia;
	}
	
	public String Nombre() {
		return this.nombre;
	}
	
	public int Tamano() {
		return this.tamano;
	}
	
	public int Agua() {
		return this.agua;
	}
	
	public int Abono() {
		return this.abono;
	}
	public int Distancia() {
		return this.distancia;
	}

}
