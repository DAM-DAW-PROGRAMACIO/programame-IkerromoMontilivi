package Easy;

import java.util.Scanner;

public class p424 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int nVeces = sc.nextInt();
		while (nVeces!= 0) {
			int acum = 0;
			int max = 0;
			for(int i = 0; i < nVeces;i ++) {
				acum += sc.nextInt();
				if(acum > max)
					max = acum;
			}
			System.out.println(acum + " " + max);
			nVeces = sc.nextInt();

		}
		sc.close();
	}
}
