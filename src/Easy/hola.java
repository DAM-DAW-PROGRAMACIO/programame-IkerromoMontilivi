package Easy;

import java.util.Scanner;

public class hola {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line.replace(" ", ", \""));
		sc.close();
	}

}
