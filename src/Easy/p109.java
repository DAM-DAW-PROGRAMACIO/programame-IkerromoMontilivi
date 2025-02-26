package Easy;

import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class p109 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		while (!line.equals("FIN")) {
			HashSet<String> equiposNombres = new HashSet<>();
			List<equipo> equipos = new ArrayList<>();
			int nElem = 0;
			long pJugadosLiga = 0;
			while(true) {
				int indEquipo1 = 0;
				int indEquipo2 = 0;
				long pEquipo1;
				long pEquipo2;
				
				line = scanner.next();
				if(line.equals("FIN"))
					break;
				if(equiposNombres.add(line)) {
					equipos.add(new equipo(line.trim()));
					indEquipo1 = nElem;
					nElem ++;
				}
				else {
					for(int i = 0; i < nElem; i++) {
						if(line.equals(equipos.get(i).Nombre())) {
							indEquipo1 = i;

							break;
						}
					}
				}
				
				pEquipo1 = scanner.nextInt();
				
				line = scanner.next();
				if(line.equals("FIN"))
					break;
				if(equiposNombres.add(line)) {
					equipos.add(new equipo(line));
					indEquipo2 = nElem;
					nElem ++;
					
				}
				
				else {
					for(int i = 0; i < nElem; i++) {
						if(line.equals(equipos.get(i).Nombre())) {
							indEquipo2 = i;

							break;
						}
					}
				}
				
				pEquipo2 = scanner.nextInt();
					
				if(pEquipo1 > pEquipo2) {
					equipos.get(indEquipo1).PuntosMas(2);
					equipos.get(indEquipo2).PuntosMas(1);
				}
				
				else{
					equipos.get(indEquipo2).PuntosMas(2);
					equipos.get(indEquipo1).PuntosMas(1);
				}
				equipos.get(indEquipo1).PJugado();
				equipos.get(indEquipo2).PJugado();
				pJugadosLiga++;
			}
			equipo EquipoG = new equipo();
			boolean Empate = false;
			for(int i = 0; i < nElem; i++) {
				if(equipos.get(i).GetPuntos() > EquipoG.GetPuntos()) {
					EquipoG = equipos.get(i);
					Empate = false;
				}
				
				else if(equipos.get(i).GetPuntos() == EquipoG.GetPuntos() && equipos.get(i).GetpJugados() == EquipoG.GetpJugados())
					Empate = true;
				
				else if(equipos.get(i).GetPuntos() == EquipoG.GetPuntos() && equipos.get(i).GetpJugados() < EquipoG.GetpJugados()) {
					EquipoG = equipos.get(i);
					Empate = false;
				}
			}
			
			if(Empate)
				System.out.println("EMPATE 0");
			else
			System.out.println(EquipoG.Nombre() + " " + (pJugadosLiga - EquipoG.GetpJugados())/2);
			
			line = scanner.next();
		}
		scanner.close();
	}

}

class equipo{
	private String nombre;
	private long puntos;
	private long pJugados;
	
	public equipo(String nombre) {
		this.nombre = nombre;
		puntos = 0;
		pJugados = 0;
	}
	
	public equipo() {
		this.nombre = null;
		puntos = 0;
		pJugados = 0;
	}
	
	public String Nombre(){
		return nombre;
	}
	
	public long GetPuntos() {
		return puntos;
	}
	
	public void PuntosMas(int p) {
		puntos += p;
	}
	
	public long GetpJugados() {
		return pJugados;
	}
	
	public void PJugado() {
		pJugados++;
	}
}

