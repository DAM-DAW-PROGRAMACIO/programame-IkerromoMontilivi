package Easy;

import java.util.Scanner;
import java.util.HashSet;
public class p578 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		while (!line.equals("0")) {
			int nVeces = Integer.parseInt(line);
			HashSet<String> prod = new HashSet<>();
			int cont = 0;
			for(int i = 0 ; i < nVeces; i++) {
				line = scanner.nextLine();
				if(prod.add(line.toLowerCase()))
					cont++;
			}
			System.out.println(cont);
			line = scanner.nextLine().trim();
		}
		scanner.close();
	}
}
