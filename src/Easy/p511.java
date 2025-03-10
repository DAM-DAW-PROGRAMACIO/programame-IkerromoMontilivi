package Easy;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class p511 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int parellesVector1, parellesVector2, quantitat;
		long valor, resultat;
		List<Long> vector1= new ArrayList<>();
		List<Long> vector2 = new ArrayList<>();
		
		while(sc.hasNextLine()) {
			parellesVector1 = sc.nextInt();
			parellesVector2 = sc.nextInt();
			vector1.clear();
			vector2.clear();
			
			for(int i = 0; i < parellesVector1; i++) {
				quantitat = sc.nextInt();
				valor = sc.nextLong();
				
				for(int j=0; j< quantitat; j++) vector1.add(valor);
			}
			for(int i = 0; i < parellesVector2; i++) {
				sc.useDelimiter("\\s+");
				String line = sc.next();
				quantitat = Integer.parseInt(line);
				valor = sc.nextLong();
				
				for(int j=0; j< quantitat; j++) vector2.add(valor);
			}
			resultat = 0;	
			for(int i = 0; i < vector1.size(); i++)
				resultat += vector1.get(i) * vector2.get(i);
			
			System.out.println(resultat);
		}

		sc.close();
	}

}
