package Easy;

import java.util.Scanner;

public class p764 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		while (!line.equals("0")) {
			int total = 0;
			int sumar;
			int restar;
			for(int i = 0; i < Integer.parseInt(line); i++) {
				sumar = scanner.nextInt();
				restar = scanner.nextInt();
				
				total += (sumar-restar);
			}
			
			System.out.println(total);
			line = scanner.next();
		}
		scanner.close();
	}
}
