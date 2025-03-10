package Easy;

import java.util.Scanner;

public class p515 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		while (!line.equals("0")) {
			int nViajes = Integer.parseInt(line);
			if(nViajes%2 != 0 && nViajes > 1)
				System.out.println(nViajes-1);
			else
				System.out.println(nViajes);
			line = scanner.next();
		}
		scanner.close();
	}
}
