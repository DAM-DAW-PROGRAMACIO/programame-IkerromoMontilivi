package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p635 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short nVeces = Short.parseShort(br.readLine());
		while(nVeces > 0){
			short n = Short.parseShort(br.readLine());
			if(n%100 == 0)
				System.out.println(n/100);
			else
				System.out.println((n/100)+1);
			nVeces--;
		}
		br.close();
	}
}
