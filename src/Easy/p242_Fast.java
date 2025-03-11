package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p242_Fast {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            int nVeces = Integer.parseInt(line.trim());
            if (nVeces == 0) break;

            long total = 0, suma = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < nVeces; i++) {
            	int n = Integer.parseInt(st.nextToken());
                total += suma * n;
                suma += n;
            }

            System.out.println(total);
        }

    }
}