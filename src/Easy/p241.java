package Easy;

import java.util.Scanner;

public class p241 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		
		for(int i = 0; i < nVeces; i++) {
			boolean imp = true;
			int nHojas = scanner.nextInt();

			if(nHojas%3 == 0)
				System.out.println("0");
			else {
				for(int j = 1; j <= nHojas; j++) {
					if(j%4 == 0 && (nHojas-j)%3 == 0) {
						System.out.println(j/4);
						imp = false;
						break;
					}
				}
				
				if(imp) {
					System.out.println("IMPOSIBLE");
				}
			}
		}
		scanner.close();
	}
}
