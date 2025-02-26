package Easy;

import java.util.Scanner;

public class p526 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String elementos = "h he li be b c n o f ne na mg al si p s cl ar k ca sc ti v cr mn fe co ni cu zn ga ge as se br kr rb sr y zr nb mo tc ru rh pd ag cd in sn sb te i xe cs ba hf ta w re os ir pt au hg tl pb bi po at rn fr ra rf db sg bh hs mt ds rg cn nh fl mc lv ts og la ce pr nd pm sm eu gd tb dy ho er tm yb lu ac th pa u np pu am cm bk cf es fm md no lr";
		while (!line.isEmpty()) {
			int i = 0;
			boolean posible = true;
			line = line.toLowerCase().replace(" ", "");
			if(line.contains("j")||line.contains("q"))
				posible = false;
			
			else {
				int n = line.length();
				while(i < line.length()-1) {
					if(!elementos.contains(String.valueOf(line.charAt(i))) && !elementos.contains(line.substring(i,i+2))) {
						posible = false;
						break;
					}
					
					if(elementos.contains(line.substring(i,i+2)))
						i ++;
					i++;
				}
				if(i < line.length() && !elementos.contains(String.valueOf(line.charAt(i))))
					posible = false;
			}
			
			if(posible)
				System.out.println("SI");
			else
				System.out.println("NO");
			
			line = scanner.nextLine();
		}
		scanner.close();
	}
}
