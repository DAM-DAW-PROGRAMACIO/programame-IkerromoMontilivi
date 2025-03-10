package Easy;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class p200 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n >= 0) {
			if(n == 0 || n == 1) {
				System.out.println(n);
				System.out.println("====");
			}
			
			else {
				int a = 0;
				int b = 1;
				int c = 0;
				List<Integer> fibs = new ArrayList<Integer>();
				fibs.add(0);
				fibs.add(1);
				boolean r = false;
				boolean fib = false;
				while(true) {
					c = a+b;
					fibs.add(c);
					if(c > n)
						break;
					else if(c == n){
						fib = true;	
						break;
					}
					if(r)
						b = c;
					else
						a = c;
					r = !r;
				}
				
				if(fib) {
					Fibonacci(fibs, 2);
					System.out.println("====");
				}
				else {
					System.out.println("[vacio]");
					System.out.println("====");
				}
			}
			
			n = sc.nextInt();
		}
		sc.close();
	}
	
	public static void Fibonacci(List<Integer> fib, int count) {
		if(fib.size() - count >= 1) {
			if(count == 2)
				System.out.println(fib.get(fib.size() - count));
			else {
				String tabs = "";
				for(int i = 0; i < count-2; i++) {
					tabs += "   ";
				}
				System.out.println(tabs + fib.get(fib.size() - (count+1)));
				System.out.println(tabs + fib.get(fib.size() - (count)));
			}
			Fibonacci(fib, count+1);
		}
	}
}


