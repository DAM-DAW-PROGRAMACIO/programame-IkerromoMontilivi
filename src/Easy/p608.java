package Easy;

import java.util.Scanner;

public class p608 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		while (!line.equals("0")) {
			int nVeces = Integer.parseInt(line);
			int[] temps = new int[nVeces];
			for(int i = 0; i < nVeces; i++) {
				temps[i] = scanner.nextInt();
			}
			
			int cont = 0;
			boolean seis = true;
			for(int i = 0; i < nVeces; i++) {
				if(temps[i] > 6)
					seis = true;
				if(temps[i] <= 4 && seis) {
					cont++;
					seis = false;
				}
					
			}
			
			System.out.println(cont);
			line = scanner.next();
		}
		scanner.close();
	}
}
