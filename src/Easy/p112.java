package Easy;

import java.util.Scanner;

public class p112 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s+");

        while (scanner.hasNext()) {
            int distancia = scanner.nextInt();
            int velMax = scanner.nextInt() ;
            int temps = scanner.nextInt();
            double velMitj = 0;

            if (distancia == 0 && velMax == 0 && temps == 0) {
                break;
            }
            
            else {
            	velMitj = distancia * 3.6 /temps;
            	System.out.println(velMitj);
            	if(temps < 0 || distancia < 0)
            		System.out.println("ERROR");
            	
            	else if(velMitj < velMax)
            		System.out.println("OK");
            	
            	else if(velMitj > velMax) {
            		if(velMitj >= velMax*1.20)
            			System.out.println("PUNTOS");
            		else
            			System.out.println("MULTA");
            	}
            }
        }
        scanner.close();
    }
}
