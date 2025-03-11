package Easy;

import java.util.Scanner;

public class p574 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int line = sc.nextInt();
			
			String uh = "UH";
			String buh = "BUH";
			
			for(int i = 1; i < line; i++) {
				uh = "U"+uh;
				buh = buh.replace(" ", "") + " " + "B" + uh + " " + buh.replace(" ", "");
			}
			System.out.println(buh.replace(" ", "").charAt((sc.nextInt())-1));
		}
		sc.close();
	}
}
