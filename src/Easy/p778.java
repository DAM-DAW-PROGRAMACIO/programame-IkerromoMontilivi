package Easy;

import java.util.Scanner;

public class p778 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int nVeces = sc.nextInt();
		while (nVeces != 0) {
			int cont = 1;
			long prev = sc.nextLong();
			long act;
			long max = prev;
			for(int i = 1; i < nVeces; i++) {
				act = sc.nextLong();
				if(act < prev)
					cont = 0;
				if(act >= max) {
					cont++;
					max = act;
				}
				prev = act;
			}	
			System.out.println(cont);
			nVeces = sc.nextInt();
		}
		sc.close();
	}
}
