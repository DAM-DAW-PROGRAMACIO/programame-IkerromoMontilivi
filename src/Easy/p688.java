package Easy;

import java.util.Scanner;

public class p688 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int c = sc.nextInt();
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			boolean ok = true;
			int ant = sc.nextInt();
			int altAnt = 0;;
			int alt;
			int act;
			int altMin = 0;
			int altMax = 0;
			for(int i = 0; i < n; i++) {
				act = sc.nextInt();
				alt = act-ant;
				if(i == 0) {
					altMin = alt;
					altMax = alt;
				}
				else {
					if(Math.abs(alt - altAnt) > c) {
						sc.nextLine();
						ok = false;
						break;
					}
					
					if(alt < altMin)
						altMin = alt;
					if(alt > altMax)
						altMax = alt;
					
					if(altMax - altMin > m) {
						ok = false;
						sc.nextLine();
						break;
					}
				}
				ant = act;
				altAnt = alt;
			}
			
			if(ok)
				System.out.println("Ok");
			else
				System.out.println("Tropiezo");
			 
		}
		sc.close();
	}
}