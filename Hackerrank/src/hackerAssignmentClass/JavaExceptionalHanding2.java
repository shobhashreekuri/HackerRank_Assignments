package hackerAssignmentClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionalHanding2 {
	static Scanner Scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try 
		{
			int x = Scan.nextInt();
			int y = Scan.nextInt();
			System.out.println("Output:" + (x/y));
		}
		catch(InputMismatchException e){
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}

}
