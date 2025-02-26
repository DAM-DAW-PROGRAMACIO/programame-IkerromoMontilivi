package Easy;

import java.util.Scanner;

public class p239 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			long n1 = scanner.nextInt();
			long n2 = scanner.nextInt();
			
			if(n1 == 0 && n2 == 0)
				break;
			
			long totalS = n1 * 6 * 24 * n2;
			long dias = totalS / 86400;
			totalS = totalS % 86400;
			
			long h = totalS / 3600;
			totalS = totalS % 3600;
			
			long m = totalS / 60;
			long s = totalS % 60;
			
			System.out.println(dias+":"+String.format("%02d", h)+":"+String.format("%02d", m)+":"+String.format("%02d", s));
			
		}
		scanner.close();
	}
}
