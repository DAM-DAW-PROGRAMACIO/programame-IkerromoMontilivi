package Easy;

import java.util.Scanner;

public class p355 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		int files;
		long total;
		
		for(int i = 0; i< nVeces; i++){
			files = scanner.nextInt();
			total =0;
			
			for(int j = 1; j <= files; j++) {
				total = total + ((j*(j+1))/2);
			}
			System.out.println(total);
		}
		scanner.close();
	}
}
