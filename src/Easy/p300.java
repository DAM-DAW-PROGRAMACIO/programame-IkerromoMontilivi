package Easy;

import java.util.Scanner;

public class p300 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		String line;
		for(int i = 0; i < nVeces; i++) {
			line = scanner.next();
			boolean vocales = false;
			if(line.contains("a")&&
					line.contains("e")&&
					line.contains("i")&&
					line.contains("o")&&
					line.contains("u"))
				vocales = true;
			if(vocales)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
		scanner.close();
	}
}
