package Easy;

import java.util.Scanner;

public class p680 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int nVeces = sc.nextInt();
		for(int i = 0; i < nVeces; i++) {
			int l = sc.nextInt();
			int a = sc.nextInt();
			int r = sc.nextInt();
			
			int cont = 1;
			int progres = a-r;
			if(a >= l)
				System.out.println(cont);
			else if(progres <= 0) {
				System.out.println("IMPOSIBLE");
			}
			else {
				cont += Math.ceil((l - a)/ (double) progres);
				System.out.println(cont);
			}
		}
		sc.close();
	}
}
