package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p456 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		for(int i = 0; i < Integer.parseInt(line); i++) {
			String liniaN = br.readLine();
			String numeros[] = liniaN.split(" ");
			
			
			int x;
			int n = Integer.parseInt(numeros[0]);	
			int m = Integer.parseInt(numeros[1]);
			int r = Integer.parseInt(numeros[2]);
			
			
			x = r/(n*m)+1;

			System.out.println(x);
		}
	}
}
