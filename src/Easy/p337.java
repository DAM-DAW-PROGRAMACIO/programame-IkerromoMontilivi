package Easy;

import java.util.Scanner;
import java.util.HashSet;

public class p337 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		int nVeces = Integer.parseInt(line);
		for(int i = 0; i < nVeces; i++) {
			int[][] dientes = new int[2][6];
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 6; k++) {
					dientes[j][k] = scanner.nextInt();
				}
			}
			HashSet<Integer> hueco = new HashSet<>();
			hueco.add((dientes[0][0] + dientes [1][0]));
			boolean iguales = true;
			for(int j = 1; j < 6; j++) {
				if(hueco.add(dientes[0][j] + dientes [1][j])) {
					iguales = false;
					break;
				}
			}
			if(iguales)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
		scanner.close();
	}
}
