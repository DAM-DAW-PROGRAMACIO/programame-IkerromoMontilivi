package Easy;

import java.util.Scanner;

public class p117 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		for(int i = 0; i < nVeces; i++) {
			String line = scanner.next();
			System.out.println("Hola, "+ scanner.next()+".");
		}
		scanner.close();
	}
}
