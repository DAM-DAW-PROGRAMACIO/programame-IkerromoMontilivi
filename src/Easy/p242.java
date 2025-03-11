package Easy;

import java.util.Scanner;

public class p242 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int nVeces = sc.nextInt();
		while (nVeces != 0) {
			long total = 0;
			long suma = 0;
			for(int i = 0; i < nVeces; i++){
				int n = sc.nextInt();
				total += suma *n;
				suma += n;
			}
			System.out.println(total);
			nVeces = sc.nextInt();
			
		}
		sc.close();
	}
}
