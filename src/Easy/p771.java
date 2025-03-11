package Easy;

import java.util.Scanner;

public class p771 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int nVeces = sc.nextInt();
		for(int i = 0; i < nVeces; i++) {
			System.out.println(sc.nextInt()*4);
		}
		sc.close();
	}
}
