package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class p100 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int nVeces = sc.nextInt();
		for(int i = 0; i < nVeces; i++) {
			String n = sc.next();
			if(n == "6174") {
				System.out.println(0);
			}
			else {
				while(n.length() < 4) {
					n = "0" + n;
				}
				
				if(n.charAt(0) == n.charAt(1) && n.charAt(0) == n.charAt(2) && n.charAt(0) == n.charAt(3))
					System.out.println(8);
				
				else {
					int j = 0;
					while(!n.equals("6174")) {
						Integer[] numeros = new Integer[] {Integer.parseInt(Character.toString(n.charAt(0))),Integer.parseInt(Character.toString(n.charAt(1))),Integer.parseInt(Character.toString(n.charAt(2))),Integer.parseInt(Character.toString(n.charAt(3)))};
						String temp;
						Arrays.sort(numeros);
						temp = "" + numeros[0] + ""+ numeros[1] +""+ numeros[2] +""+ numeros[3];
						int nP = Integer.parseInt(temp);
						temp = "" + numeros[3] +""+ numeros[2] +""+ numeros[1] + ""+numeros[0];
						int nG = Integer.parseInt(temp);
						
						int nR = nG - nP;
						n = "" + nR;
						while(n.length() < 4) {
							n = "0" + n;
						}
						
						j++;
					}
					System.out.println(j);
				}
			}
		}
		sc.close();
	}
}
