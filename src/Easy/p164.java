package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p164 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (line != null) {
			String coords[] = line.split(" ");
			int coordsInt[] = new int[coords.length];
			
			for (int i = 0; i < coords.length; i++)
				coordsInt[i] = Integer.parseInt(coords[i]);
			
			if (coordsInt[0] <= coordsInt[2] || coordsInt[1] <= coordsInt[3])
				System.out.println((coordsInt[2] - coordsInt[0]) * ( coordsInt[3] - coordsInt[1]));
			
			line = br.readLine();
		}
	}
}
