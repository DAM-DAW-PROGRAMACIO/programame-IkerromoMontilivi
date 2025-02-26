package Easy;

import java.util.Scanner;

public class p401 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		String line;
		for(int i = 0; i < nVeces; i++) {
			String palabra1 = scanner.next().toLowerCase().replace('b', 'v');
			String palabra2 = scanner.next().toLowerCase().replace('b', 'v');
			boolean tr = false; 
			for(int j = 1; j < palabra1.length(); j++) {
				
				if(palabra1.equals(palabra2) || palabra1.length() != palabra2.length()) {
					tr = false;
					break;
				}
				StringBuilder sb = new StringBuilder();
				sb.append(palabra1.substring(palabra1.length()-j, palabra1.length()));
				sb.append(palabra1.substring(0, palabra1.length()-j ));
				if(sb.toString().equals(palabra2)) {
					tr = true;
					break;
				}
			}
			if(tr) {
				System.out.println("SI");
			}
			else
				System.out.println("NO");
		}
		scanner.close();
	}
}
