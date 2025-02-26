package Easy;

import java.util.Scanner;

public class p164 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			
			if(x2 < x1 || y2 < y1)
				break;
			System.out.println((x2-x1)*(y2-y1));
		}
		scanner.close();
	}
}
