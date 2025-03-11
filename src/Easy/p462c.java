package Easy;

import java.util.Scanner;

public class p462c {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String line = sc.nextLine();
		int casos = Integer.parseInt(line);
		int limpiezas;
		
		for (int i = 0; i < casos; i++) {
			line = sc.nextLine();
			String entrada[] = line.split(" ");
			limpiezas = Integer.parseInt(entrada[0]);
			String temps[] = entrada[1].split(":");
			
			long segonsTotals = limpiezas * (Integer.parseInt(temps[0]) * 3600 + Integer.parseInt(temps[1]) * 60 + Integer.parseInt(temps[2]));
			long dies = segonsTotals / (3600 * 24);
			segonsTotals %= 3600 * 24;
			long hores = segonsTotals / 3600;
			segonsTotals %=  3600;
			long minuts = segonsTotals / 60;
			segonsTotals %= 60;
			
			System.out.format("%d %02d:%02d:%02d\n", dies, hores, minuts, segonsTotals);
		}
		sc.close();
	}
}
