package Easy;

import java.util.Scanner;

public class p576 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		while (!line.equals("0")) {
			int tpd = Integer.parseInt(line);
			int tiempo = 0;
			while(true) {
				line = scanner.next();
				if(line.equals("0"))
					break;
				else
					tiempo += tpd * Integer.parseInt(line);
			}
			int horas = tiempo/3600;
			tiempo = tiempo % 3600;
			int minutos = tiempo /60;
			int segundos = tiempo % 60;
			
			System.out.println(String.format("%02d",horas)+":"+String.format("%02d",minutos)+":"+String.format("%02d",segundos));
			line = scanner.next();
		}
		scanner.close();
	}
}
