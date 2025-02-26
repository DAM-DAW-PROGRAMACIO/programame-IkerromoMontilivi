package Easy;

import java.util.Scanner;

public class hola {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String line;
		int digits; 
		int ultDigits;
		String lletres;
		
		
		
		line = sc.nextLine();
		while(!line.equals("9999 ZZZ")) {
			
			String[] arrayLine = line.split(" ");
			
			digits = Integer.parseInt(arrayLine[0]);
			lletres = arrayLine[1];

			if(digits != 9999) {
				ultDigits = digits++;
			}
			else {
				ultDigits=0000;
				if(lletres.endsWith("Z"))
				{
					char lletra = lletres.charAt(1);
					lletra++;
					if(lletra == 'A' || lletra == 'E' || lletra == 'I' || lletra == 'O' || lletra == 'U')
						lletra++;
					
					lletres = ""+lletres.charAt(0) + lletra + 'B';
					
				}else if(lletres.endsWith("ZZ"))
				{
					char lletra = lletres.charAt(0);
					lletra++;
					if(lletra == 'A' || lletra == 'E' || lletra == 'I' || lletra == 'O' || lletra == 'U')
						lletra++;
					
					lletres = lletra + "BB";
				}else {
					char lletra = lletres.charAt(2);
					lletra++;
					if(lletra == 'A' || lletra == 'E' || lletra == 'I' || lletra == 'O' || lletra == 'U')
						lletra++;
					
					lletres = ""+lletres.charAt(0) + lletres.charAt(1)+ lletra;
				}
			}
				
			System.out.format("%04d %s\n",ultDigits, lletres);
			
			
			line=sc.nextLine();
		}
		sc.close();
	}

}
