package Easy;

import java.util.Scanner;

public class p682 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		
		for(int i = 0; i < nVeces;i++) {
			int n = scanner.nextInt();
			System.out.println(n + " " + n*2);
		}
		scanner.close();
	}
}
