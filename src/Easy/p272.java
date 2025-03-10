package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p272 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		
		for(int i = 0; i < nVeces; i++) {
			int n = scanner.nextInt();
			List<Integer> numeros = new ArrayList<Integer>();
			int resto;
			while(true) {
				resto = n%6;
				numeros.add(resto);
				n = n/6;
				if(n == 0)
					break;
			}
			String text = "";
			for(int j = numeros.size()-1; j >= 0; j--) {
				text += numeros.get(j);
			}
			System.out.println(text);
		}
		scanner.close();
	}
}
