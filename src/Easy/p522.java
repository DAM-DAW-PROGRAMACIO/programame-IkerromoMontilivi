package Easy;

import java.util.Scanner;

public class p522 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		String[] abc = {"a", "b", "c", "ch", "d", "e", "f", "g", "h", "i", "j", "k", "l", "ll", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y","z"};
		
		while (scanner.hasNext()) {
			String p1 = scanner.next();
			String p2 = scanner.next();
			
			String w = "a";
			int i1 = 0;
			int i2 = 0;
			while(i1 < p1.length() && i2 < p2.length()) {
				String L1 = Character.toString(p1.charAt(i1));
				String L2 = Character.toString(p2.charAt(1));
				
				if(i1 + 1 != p1.length() && L1 == "c" && Character.toString(p1.charAt(i1+1)) == "h") {
					L1 = "ch";
					i1++;
				}
				if(i2 + 1 != p2.length() && L2 == "c" && Character.toString(p2.charAt(i2+1)) == "h") {
					L2 = "ch";
					i2++;
				}
				if(i1 + 1 != p1.length() && L1 == "l" && Character.toString(p1.charAt(i1+1)) == "l") {
					L1 = "ll";
					i1++;
				}
				if(i2 + 1 != p2.length() && L2 == "l" && Character.toString(p2.charAt(i2+1)) == "l") {
					L2 = "ll";
					i2++;
				}
				
				boolean L1t = false;
				boolean L2t = false;
				
				int pos1 = 0;
				int pos2 = 0;
				for(int i = 0; i < abc.length; i++) {
					if(abc[i].equals(L1)) {
						pos1 = i;
						L1t = true;
					}					
					if(abc[i].equals(L2)) {
						pos2 = i;
						L2t = true;
					}
					if(L1t && L2t)
						break;
				}
				
				if(pos1 < pos2) {
					w = p1;
					break;
				}
				
				if(pos1 > pos2) {
					w = p2;
					break;
				}
				
				i1++;
				i2++;
			}
			System.out.println(w);
		}
		scanner.close();
	}
}
