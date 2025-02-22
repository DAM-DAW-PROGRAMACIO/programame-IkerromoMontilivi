package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p764 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (line != null && !line.startsWith("0")) {
			
			int total = 0;
			int nCamps = Integer.parseInt(line);
				
			for (int i = 0; i < nCamps; i++){
					
				line = br.readLine();
				String campaign[] = line.split(" ");
				total += (Integer.parseInt(campaign[0]) - Integer.parseInt(campaign[1]));
			}
				
			System.out.println(total);
				
			line = br.readLine();
		}
	}
}
