package Easy;

import java.util.Scanner;

public class p148 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		while (!line.equals("00:00")) {
			Scanner scanLinea = new Scanner(line);
			scanLinea.useDelimiter(":");
			int horas = scanLinea.nextInt();
			int minutos = scanLinea.nextInt();
			int minutosRestantes = 1440 - ((horas*60)+minutos);
			System.out.println(minutosRestantes);
			line = scanner.nextLine();
		}
		scanner.close();
	}
}
