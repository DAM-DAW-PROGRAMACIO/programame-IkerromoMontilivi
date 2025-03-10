package Easy;

import java.util.Scanner;
import java.util.Stack;

public class p141 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line;
		
		while (scanner.hasNextLine()) {
			line = line = scanner.nextLine();
			Stack<Character> parentesis = new Stack<Character>();
			boolean posible = true;
			for(int i = 0; i < line.length(); i++){
				char lletra = line.charAt(i);
				if(lletra=='('||lletra=='['||lletra=='{')
					parentesis.push(lletra);
				
				if(lletra ==')' && (parentesis.size() == 0 || parentesis.peek() != '(')) {
					posible = false;
					break;
				}
				if(lletra ==')' && parentesis.peek() == '(') 
					parentesis.pop();

				
				if(lletra =='}' && (parentesis.size() == 0 || parentesis.peek() != '{')) {
					posible = false;
					break;
				}
				if(lletra =='}' && parentesis.peek() == '{') 
					parentesis.pop();
				
				
				if(lletra ==']' && (parentesis.size() == 0 || parentesis.peek() != '[')) {
					posible = false;
					break;
				}
				if(lletra ==']' && parentesis.peek() == '[') 
					parentesis.pop();
			}
			if(parentesis.size() != 0)
				posible = false;
			
			if(posible)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		scanner.close();
	}
}