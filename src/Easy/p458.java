package Easy;

import java.util.Scanner;
import java.util.Arrays;
public class p458 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		while (!line.equals("0")) {
			int nVeces = Integer.parseInt(line);
			long[] numeros = new long[nVeces];
			for(int i = 0; i < nVeces; i++)
				numeros[i] = scanner.nextInt();
			Arrays.sort(numeros);
			if(numeros[0]*numeros[1] > numeros[nVeces-1]*numeros[nVeces-2])
				System.out.println(numeros[0]*numeros[1]);
			else
				System.out.println(numeros[nVeces-1]*numeros[nVeces-2]);
			line = scanner.next();
		}
		scanner.close();
	}
}
