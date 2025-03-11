package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p238 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int billetes = scanner.nextInt();
		int piratas = scanner.nextInt();
	
		while (billetes >= 1 || piratas >= 1) {
			int n = 0;
			Pirata[] piratasL = new Pirata[piratas];
			for(int i = 0; i < piratas; i++)
				piratasL[i] = new Pirata();
			
			for(int i = 0; i < billetes; i++) {
				piratasL[n].dineros(scanner.nextInt());
				n++;
				if(n == piratas) {
					n = 0;
				}
			}
			
			for(int i = 0; i < piratas; i++) {
				System.out.println((piratasL[i].total() + ":" + " " + piratasL[i].dineros().toString().replace(",","").replace("[","").replace("]","")).trim());
			}
			
			System.out.println("---");
			billetes = scanner.nextInt();
			piratas = scanner.nextInt();
		}
		scanner.close();
	}
}

class Pirata{
	private int total;
	private List<Integer> dineros;
	
	public Pirata() {
		total = 0;		
		dineros = new ArrayList<Integer>();
	}
	
	public void dineros(int x) {
		dineros.add(x);
		total += x;
	}
	
	public int total() {
		return total;
	}
	
	public List<Integer> dineros(){
		return dineros;
	}
}