package Easy;

import java.util.Scanner;

public class p407 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			scanner.useDelimiter("\\s+");
			int fin = scanner.nextInt();
			int inicial = scanner.nextInt();
			int move = scanner.nextInt();
			
			if(fin == 0 && inicial == 0 && move == 0)
				break;
			else {
				if(inicial + move < fin)
					System.out.println(inicial + move);
				else
					System.out.println(fin - ((inicial + move) - fin));
			}
				
		}
		scanner.close();
	}
}
