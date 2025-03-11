package Easy;

import java.util.Scanner;

public class p492 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int M = sc.nextInt();
			int D = sc.nextInt();
			int N = sc.nextInt();
			if(M == 0 && D == 0 && N == 0)
				break;
			
			if(D > M) {
				int aux = M;
				M = D;
				D = aux;
			}
			
			int mcd = 0;
		    int a = M;
		    int b = D;
		    
		    while(b != 0) {
		    	mcd = b;
		    	b = a%b;
		    	a = mcd;
		    }
		    
		    long mcm = (D*((long)M/mcd));
		    System.out.println(N/mcm);
		}
		sc.close();
	}
}
