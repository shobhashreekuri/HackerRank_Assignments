package hackerAssignmentClass;

import java.util.Scanner;

class MyCalculator{
	public long calculation(int n,int p)throws Exception {
		if(n < 0 || p < 0) {
		throw new Exception	("n and p should not be negative");
		}else if (n == 0 && p == 0) {
		throw new Exception ("n and p should not Zero");
		}else
			return (long)Math.pow(n, p);
	}
}

public class JavaExceptionhandling1 {
	static MyCalculator ca = new MyCalculator();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		while(scan.hasNextInt()) {
			int p = scan.nextInt();
			int n = scan.nextInt();
			try {
				System.out.println(ca.calculation(n, p));
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
