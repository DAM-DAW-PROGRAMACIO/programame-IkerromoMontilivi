package Easy;

import java.util.Scanner;

public class p462 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		
		for(int i = 0; i < nVeces; i++) {
			int limpiar = scanner.nextInt();
			Scanner scL = new Scanner(scanner.nextLine().trim());
			scL.useDelimiter(":");
			long h = scL.nextInt();
			long m = scL.nextInt();
			long s = scL.nextInt();
			
			long totalS = (h*3600 + m*60 + s) * limpiar;
			long dias = totalS / 86400;
			totalS = totalS % 86400;
			
			h = totalS / 3600;
			totalS = totalS % 3600;
			
			m = totalS / 60;
			s = totalS % 60;
			
			System.out.println(dias + " " + String.format("%02d", h) +":"+String.format("%02d", m)+":"+String.format("%02d", s));
		}
		scanner.close();
	}
}
