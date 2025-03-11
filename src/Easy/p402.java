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
			List<Integer> divisors = new ArrayList<Integer>();
			int arrel = (int) Math.sqrt(numero);
			
			for(int i = 2; i <= arrel; i++) {
				if(numero%i == 0) {
					divisors.add(numero/i);
					int parella = numero/i;
					if(parella != numero/i)
						divisors.add(numero/parella);
				}
			}
						
			line = br.readLine();
		}
	}
}
