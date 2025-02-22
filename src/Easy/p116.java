package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p116 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int num = Integer.parseInt(line);
		
		for (int i = 0; i < num; i++) {
			System.out.println("Hola mundo.");
		}
	}
}
