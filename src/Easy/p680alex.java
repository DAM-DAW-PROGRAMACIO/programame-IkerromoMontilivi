package Easy;

import java.util.Scanner;

public class p680alex {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		for(int i=0; i<casos; i++) {
			
			int longitudMax = sc.nextInt();
			int longitudSal = sc.nextInt();
			int retroces = sc.nextInt();
			
			if(longitudMax <= longitudSal) {
				System.out.println(1);
			}		
			else if(retroces >= longitudSal)
				System.out.println("IMPOSIBLE");
			else {
				
				System.out.println(longitudMax/(longitudSal-retroces));
			}

		}
		sc.close();
	}
}
