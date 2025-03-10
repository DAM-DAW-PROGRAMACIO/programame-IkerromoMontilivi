package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p588 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		while (n != 0) {
			List<Long> numeros = new ArrayList<Long>();
			long resto;
			while(true) {
				resto = n%2;
				numeros.add(resto);
				n = n/2;
				if(n == 0)
					break;
			}
			String text = "";
			String textR = "";
			boolean uno = false;
			boolean unoR = false;
			int cont = 0;
			int contR = 0;
			for(int j = numeros.size()-1, i = 0; j >= 0; j--, i++) {
				if(numeros.get(i) == 0 && !uno)
					cont++;
				if(numeros.get(i) != 0 || uno) {
					text = numeros.get(i) + text;
					uno = true;
				}
				
				if(numeros.get(j) == 0 && !unoR)
					contR++;
				
				if(numeros.get(j) != 0 || unoR) {
					textR = numeros.get(j) + textR;
					unoR = true;
				}
			}
			text = text.substring(contR);
			textR = textR.substring(cont);
			if(text.equals(textR))
				System.out.println("SI");
			else
				System.out.println("NO");
			
			n = sc.nextLong();
		}
		sc.close();
	}
}
