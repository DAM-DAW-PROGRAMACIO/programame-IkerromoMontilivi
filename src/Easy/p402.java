package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p402 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while(!line.equals("0")){
			int numero = Integer.parseInt(line);
			int llarg = numero;
			int diffMin = numero-1;
			int n = 1;

			while (numero/2 > n) {
				n++;
				if (numero % n == 0) {
					if(Math.abs(n - numero/n) < diffMin) {
						diffMin = Math.abs(n - numero/n);
						if(n > numero/n)
							llarg = n;
						else
							llarg = numero/n;
					}
				}
					
			}
			System.out.println(llarg);
			line = br.readLine();
		}
	}
}
