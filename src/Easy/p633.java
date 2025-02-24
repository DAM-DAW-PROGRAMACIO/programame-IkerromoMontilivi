package Easy;

import java.util.Scanner;
import java.util.HashSet;


public class p633 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String linea = scanner.nextLine();
		
		while (!linea.isEmpty()) {
			int parejas = 0;
			int parejasInc = 0;
			int repes = 0;
			HashSet<String> noRepes = new HashSet<String>();
			for(int i = 0; i< Integer.parseInt(linea); i++) {
				scanner.useDelimiter("\\s+");
				if(!noRepes.add(scanner.next())) {
					repes++;
				}
				/*
				foreach(String ainmal : noRepes);
				{
					String parella;
					if(animal.endsWith("a")) {
						parella = animal.Substring(0, (animal.length()-1)+"o");
						if(noRepes.contains(parella)) {
							parelles++;
							
						}
					}
						
				}
				*/
				
			}
			
			linea = scanner.nextLine();
		}
		scanner.close();
	}
}
