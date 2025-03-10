package Easy;

import java.util.Scanner;

public class p107 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);		
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(m == 0 && n == 0)
				break;
			
			boolean[] primos = new boolean[n+1];
			for(int i = 2; i <= n; i++)
				primos[i] = true;
			
			int cont = 0;
			for(long i = 2; i <= n; i++) {
				if(primos[(int)i]) {
					for(long j = i * i; j <= n; j += i) {
						primos[(int)j] = false;
					}
				}
			}
			
			for(int i = 2; i < primos.length; i++) {
				if(primos[i])
					cont++;
			}
			double error = Math.abs((((double) cont)/n) - (1/Math.log(n)));
			double errorP = 1/Math.pow(10, m);
			if(error > errorP)
				System.out.println("Mayor");
			else if(error < errorP)
				System.out.println("Menor");
			else
				System.out.println("Igual");
			
		}
		sc.close();
	}
}
