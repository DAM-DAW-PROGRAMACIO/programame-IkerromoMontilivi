package Easy;

import java.util.Scanner;

public class p245 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Long nHermanos = scanner.nextLong();
		
		while (nHermanos != 0) {
			boolean dalton = true;
			boolean daltonR = true;
			
			long hermanoAnt = scanner.nextLong();
			for(int i = 0; i < nHermanos-1; i++) {
				long hermanoAct = scanner.nextLong();
				if(hermanoAnt >= hermanoAct)
					dalton = false;
				
				if(hermanoAnt <= hermanoAct)
					daltonR = false;
				
				if(!(dalton || daltonR))
					break;
				
				hermanoAnt = hermanoAct;
			}
			scanner.nextLine();


			if(dalton || daltonR)
				System.out.println("DALTON");
			else
				System.out.println("DESCONOCIDOS");
			nHermanos = scanner.nextLong();
			
		}
		scanner.close();
	}
}
