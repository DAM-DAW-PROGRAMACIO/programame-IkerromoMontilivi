package Easy;

import java.util.Scanner;

public class p355 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		long nVeces = scanner.nextInt();
		long files;
		long total;
		
		for(int i = 0; i< nVeces; i++){
			files = scanner.nextInt();
			total =0;
			long filaAnt = 0;;
			for(int j = 1; j <= files; j++) {
				total += j + filaAnt;
				filaAnt += j;
			}
			System.out.println(total);
		}
		scanner.close();
	}
}
