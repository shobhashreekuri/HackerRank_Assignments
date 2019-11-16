package hackerAssignmentClass;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while(scan.hasNext()) {
			//String input = scan.next();
			System.out.println(isBalanced(scan.next()));
			
		}

	}
	
	public static boolean isBalanced(String par) {
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i<par.length(); i++) {
			char ch = par.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[')
			{
				stack.push(ch);
			}else if(stack.empty()) {
				return false;
			}else {
				char top = stack.pop();
				if((top =='(' && ch != ')') ||(top == '{' && ch != '}' ) || (top == '[' && ch != ']'))
				{
					return false;
				}
			}
			
		}
		return stack.empty();
	}

}
