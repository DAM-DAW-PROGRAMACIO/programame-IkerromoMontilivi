package Easy;

import java.util.Scanner;
import java.util.TreeSet;

public class p185 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int nVeces = scanner.nextInt();
		
		while (nVeces != 0) {
			TreeSet<String> Si = new TreeSet<String>();
			TreeSet<String> No = new TreeSet<String>();
			for(int i = 0; i < nVeces; i++) {
				if(scanner.next().equals("SI:")) {
					while(true) {
						String ingredient = scanner.next();
						if(ingredient.equals("FIN"))
							break;
						Si.add(ingredient);
					}
				}
				else {
					while(true) {
						String ingredient = scanner.next();
						if(ingredient.equals("FIN"))
							break;
						No.add(ingredient);
					}
				}
			}
			
			No.removeAll(Si);
			System.out.println(No.toString().replace(",", "").replace("[", "").replace("]", ""));
			nVeces = scanner.nextInt();
		}
		scanner.close();
	}
}
