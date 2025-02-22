package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p455 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String nVegades = br.readLine();
		String line;
		
		for(int i = 0; i < Integer.parseInt(nVegades); i++) {
			line = br.readLine();
			int dividend = Integer.parseInt(line);
			int divisor = 10000;
			for(int j = 2; j <= dividend; j++) {
				if(dividend % j == 0 && divisor % j == 0) {
					dividend = dividend / j;
					divisor = divisor /j;
					j = 1;
				}
			}
			System.out.println(divisor);
			
		}
	}
}
