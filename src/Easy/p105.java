package Easy;

import java.util.Scanner;
import java.util.Arrays;
public class p105 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		int cont = 0;
		
		String diasS[] = new String[] {"MARTES ", "MIERCOLES ", "JUEVES ", "VIERNES ", "SABADO ", "DOMINGO "};
		double[] dias = new double[6];
		
		while (!line.equals("-1")) {
			double n = Double.parseDouble(line);
			dias[cont] = n;
			cont++;
			if(cont == 6) {
				double mayor = dias[0];
				int indM = 0;
				double menor = dias[0];
				int indMn = 0;
				boolean empate1 = false;
				boolean empate2 = false;
				for(int i = 1; i < 6; i++) {
					if(dias[i] > mayor) {
						mayor = dias[i];
						indM = i;
						empate1 = false;
					}
					else if(dias[i] == mayor)
						empate1 = true;
				}
				for(int i = 1; i < 6; i++) {
					if(dias[i] < menor) {
						menor = dias[i];
						indMn = i;
						empate2 = false;
					}
					else if(dias[i] == menor)
						empate2 = true;
				}
				StringBuilder sb = new StringBuilder();
				if(empate1)
					sb.append("EMPATE ");
				else
					sb.append(diasS[indM]);
				
				if(empate2)
					sb.append("EMPATE ");
				else
					sb.append(diasS[indMn]);
				
				double media = 0;
				for(int i = 0; i < 6; i++) {
					media += dias[i];
				}
				media = media/6;
				
				if(dias[5] > media)
					sb.append("SI");
				else
					sb.append("NO");
				
				System.out.println(sb);
				cont = 0;
			}
				
			line = scanner.next();
		}
		scanner.close();
	}
}
