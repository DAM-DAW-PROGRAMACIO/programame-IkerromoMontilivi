package Easy;

import java.util.Scanner;

public class p154 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String abc = "BCDFGHJKLMNPQRSTVWXYZ";
		
		while (!line.equals("9999 ZZZ")) {
			Scanner scanLinea = new Scanner(line);
			scanLinea.useDelimiter("\\s+");
			int partNum = scanLinea.nextInt();
			String partAbc = scanLinea.next();
			StringBuilder sb = new StringBuilder();
			sb.append(partAbc);
			
			if(partNum + 1 <= 9999) 
				partNum ++;	
			
			else {
				partNum = 0000;
				int i = 0;
				while(abc.charAt(i) != partAbc.charAt(2)) {
					i++;
				}
				
				if((i + 1) != 21) {
					sb.setCharAt(2, abc.charAt(i+1));
				}
				
				else {
					sb.setCharAt(2, 'B');
					i = 0;
					while(abc.charAt(i) != partAbc.charAt(1)) {
						i++;
					}
					
					if((i + 1) != 21) {
						sb.setCharAt(1, abc.charAt(i+1));
					}
					
					else {
						sb.setCharAt(1, 'B');
						i = 0;
						while(abc.charAt(i) != partAbc.charAt(0)) {
							i++;
						}

						sb.setCharAt(0, abc.charAt(i+1));

					}
				}
			}
			
			System.out.println(String.format("%04d", partNum) + " " + sb);
			line = scanner.nextLine();
		}
		scanner.close();
	}
}
