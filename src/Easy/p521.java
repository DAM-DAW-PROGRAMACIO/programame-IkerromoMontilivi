package Easy;

import java.util.Scanner;
import java.util.TreeSet;

public class p521 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int pisos = scanner.nextInt();
		int puertas = scanner.nextInt();
		int as = scanner.nextInt();
				
		while (pisos != 0 || puertas != 0 || as != 0) {
			TreeSet<String> reales = new TreeSet<String>();
			int count = 0;
			for(int i = 0; i < as; i++) {
				if(reales.add(scanner.next() + scanner.next()))
					count++;
			}
			
			int total = pisos * puertas;
			if(total % 2 == 1)
				total++;
			
			if(count >= total/2)
				System.out.println("EMPEZAMOS");
			else
				System.out.println("ESPERAMOS");
			
			pisos = scanner.nextInt();
			puertas = scanner.nextInt();
			as = scanner.nextInt();
				
		}
		scanner.close();
	}
}
