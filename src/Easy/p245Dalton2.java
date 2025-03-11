package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p245Dalton2 {

	static class FastReader {

	    BufferedReader br;
	    StringTokenizer st;

	    public FastReader() {
	        br = new BufferedReader(
	                new InputStreamReader(System.in));
	    }

	    String next() {
	        while (st == null || !st.hasMoreElements()) {
	            try {
	                st = new StringTokenizer(br.readLine());
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        return st.nextToken();
	    }

	    int nextInt() {
	        return Integer.parseInt(next());
	    }

	    long nextLong() {
	        return Long.parseLong(next());
	    }

	    double nextDouble() {
	        return Double.parseDouble(next());
	    }

	    String nextLine() {
	        String str = "";
	        try {
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	    }

	    boolean hasNext() {
	        if (st != null && st.hasMoreTokens()) {
	            return true;
	        }
	        String tmp;
	        try {
	            br.mark(1000);
	            tmp = br.readLine();
	            if (tmp == null) {
	                return false;
	            }
	            br.reset();
	        } catch (IOException e) {
	            return false;
	        }
	        return true;
	    }
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		FastReader sc = new FastReader();
		String linia=sc.nextLine();

		
		while(!linia.equals("0")) {
			
			
			if(Dalton(sc,Integer.parseInt(linia))) {
				System.out.println("DALTON");
			} else {
				System.out.println("DESCONOCIDOS");
			}
			
			//consumir el salt de linia
			sc.nextLine();
			linia=sc.nextLine();
		}
	}
		
	public static boolean Dalton(FastReader sc, int num) {
		long actual;
		long anterior;
		long diff, diff2;
		
		anterior = sc.nextLong();
		actual = sc.nextLong();
		diff = actual -anterior;
		
		if(diff==0) return false;
		
		for(int i=2;i<num;i++) {
			anterior = actual;
			actual = sc.nextLong();
			diff2 = actual-anterior;
			if(diff2==0 || diff<0 && diff2>0 || diff>0 && diff2<0)
				return false;
		}
		return true;		
	}
	

}


