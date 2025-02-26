package Easy;

import java.util.Scanner;
import java.util.HashSet;


public class p633 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String linea = scanner.nextLine();
		
		while (!linea.equals("0")) {
			int parejas = 0;
			int repes = 0;
			int solteros = 0;
			HashSet<String> noRepes = new HashSet<String>();
			for(int i = 0; i< Integer.parseInt(linea); i++) {
				if(!noRepes.add(scanner.next()))
					repes++;
			}
			for(String animal : noRepes)
			{
				String parella = null;
				if(animal.endsWith("a")) 
					parella = animal.substring(0, (animal.length()-1)) + "o";
				if(animal.endsWith("o")) 
					parella = animal.substring(0, (animal.length()-1)) + "a";
				if(noRepes.contains(parella)) 
					parejas++;
				else
					solteros++;
			}
			
			System.out.println(parejas/2 + " " + solteros + " " + repes);
			
			linea = scanner.next();
		}
		scanner.close();
	}
}
