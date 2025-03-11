package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p689_br {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int c = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            line = br.readLine();  // Leer la siguiente línea con los valores
            st = new StringTokenizer(line);

            boolean ok = true;
            int ant = Integer.parseInt(st.nextToken());
            int altAnt = 0;
            int alt;
            int act;
            int altMin = 0;
            int altMax = 0;

            for (int i = 0; i < n; i++) {
                act = Integer.parseInt(st.nextToken());
                alt = act - ant;

                if (i == 0) {
                    altMin = alt;
                    altMax = alt;
                } else {
                    if (Math.abs(alt - altAnt) > c) {
                        ok = false;
                        break;
                    }

                    altMin = Math.min(altMin, alt);
                    altMax = Math.max(altMax, alt);

                    if (altMax - altMin > m) {
                        ok = false;
                        break;
                    }
                }
                ant = act;
                altAnt = alt;
            }

            System.out.println(ok ? "Ok" : "Tropiezo");
        }
        br.close();
    }
}