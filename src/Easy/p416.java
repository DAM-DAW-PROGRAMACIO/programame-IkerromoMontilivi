package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p416 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		while (!line.equals("0")) {
			long nVeces = Long.parseLong(line);
			boolean repe = false;
			HashSet<String> dob = new HashSet<String>();
			for(long i = 0; i < nVeces; i++) {
				String data = scanner.next();
				if(!dob.add(data.substring(0, data.length() - 4))) {
					repe = true;
				}
			}
			if(repe)
				System.out.println("SI");
			else
				System.out.println("NO");
			
			line = scanner.next();
		}
		scanner.close();
	}
}
