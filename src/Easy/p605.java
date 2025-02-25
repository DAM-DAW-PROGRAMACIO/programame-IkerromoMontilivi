package Easy;

import java.util.Scanner;

public class p605 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		while (!line.equals(".")) {
			int contV = 0;
			int contI = 0;
			
			while(true) {
				if(line.equals("V"))
					contV++;
				else if(line.equals("I"))
					contI++;
				
				line = scanner.next();
				if(line.equals("."))
					break;
			}
			if(contV > contI)
				System.out.println("VERANO");
			else if(contI > contV)
				System.out.println("INVIERNO");
			else
				System.out.println("EMPATE");

			line = scanner.next();
		}
		scanner.close();
	}
}
