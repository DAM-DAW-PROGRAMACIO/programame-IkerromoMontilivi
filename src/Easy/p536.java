package Easy;

import java.util.Scanner;
import java.util.ArrayList;

public class p536 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String nVeces;
		
		while(sc.hasNextLine()) {	
			nVeces = sc.nextLine();

			Huerto max = new Huerto();
			for(int i = 0; i < Integer.parseInt(nVeces); i++) {		
				int tamano = sc.nextInt();
				int abono = sc.nextInt();
				int agua = sc.nextInt();
				int distancia = sc.nextInt();
				String nombre = sc.nextLine();

				Huerto actual = new Huerto(nombre, tamano, agua, abono, distancia);
				if(i == 0) {
					max = actual;
				}
				else {
					max = actual.CompareTo(max);
				}
					
			}
			System.out.println(max.Nombre().trim());

		}
	
		sc.close();
		
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
	
	public Huerto() {
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
	
	public Huerto CompareTo(Huerto max) {
		if(Tamano() > max.Tamano()) {
			max = this;
		}
		else if (Tamano() == max.Tamano()) {
			if(Agua() < max.Agua()) {
				max = this;
			}
			else if(Agua() == max.Agua()) {
				if(Distancia() < max.Distancia())
					max = this;
				else if(Distancia() == max.Distancia())
					if(Abono() < max.Abono())
						max = this;
			}
		}
		
		return max;
	}
}
