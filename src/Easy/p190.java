package Easy;

import java.util.Scanner;

public class p190 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\s+");
		long num = scanner.nextInt();
		long den = scanner.nextInt();
		while (!(num < den)) {
			if(num == den)
				System.out.println(1);
			else {
				for(long i = (num - 1); i > den; i--)
					num = num * i;
				System.out.println(num);
			}
			
			num = scanner.nextInt();
			den = scanner.nextInt();
		}
		scanner.close();
	}

}
