package Easy;

import java.util.Scanner;

public class p283 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int F = sc.nextInt();
			int C = sc.nextInt();
			sc.nextLine();
			Character[][] campo = new Character[F][C];
			boolean[][] check = new boolean[F][C];
			for(int i = 0 ; i < F; i++) {
				String line = sc.nextLine();
				for(int j = 0; j < C; j++) {
					campo[i][j] = line.charAt(j);
					check[i][j] = false;
				}
			}
		
			Check tabla = new Check(check, F, C);
			
			int countMax = 0;
			for(int i = 0 ; i < F; i++) {
				for(int j = 0; j < C; j++) {
					if(!tabla.g()[i][j] && campo[i][j] == '#') {
						int count = 0;
						count = Funcion(i, j, tabla, campo, count);
						if(count == 0)
							count = 1;
						if(count > countMax)
							countMax = count;
					}
				}
			}
			System.out.println(countMax);
			
		}
		sc.close();
	}
	
	static int Funcion(int i, int j, Check tabla, Character[][] campo, int count){
		if( j+1 < tabla.C() && !tabla.g()[i][j+1] && campo[i][j+1] == '#') {
			tabla.s(i, j+1);
			count = Funcion(i, j+1, tabla, campo, count);
			count++;
		}
		if( j-1 >= 0 && !tabla.g()[i][j-1] && campo[i][j-1] == '#') {
			tabla.s(i, j-1);
			count = Funcion(i, j-1, tabla, campo, count);
			count++;
		}
		if(i + 1 < tabla.F() && !tabla.g()[i + 1][j] && campo[i +1][j] == '#') {
			tabla.s(i + 1, j);
			count = Funcion(i + 1, j, tabla, campo, count);
			count++;
		}
		if(i - 1 >= 0 && !tabla.g()[i - 1][j] && campo[i - 1][j] == '#') {
			tabla.s(i - 1, j);
			count = Funcion(i - 1, j, tabla, campo, count);
			count++;
		}
		
		return count;
	}
}

class Check{
	boolean[][] check;
	int C;
	int F;
	
	public Check(boolean[][] check,int F,int C) {
		this.check = check;
		this.C = C;
		this.F = F;
	}
	
	public boolean[][] g(){
		return check;
	}
	
	public void s(int i, int j) {
		check[i][j] = true;
	}
	
	public int F() {
		return F;
	}
	
	public int C() {
		return C;
	}
}

