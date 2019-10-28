package hackerAssignmentClass;

import java.util.Scanner;

public class hackerAssignmentClass2 {
		public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		//formattingOutput();
		multiply();
		scan.close();

	}
	
	/*
	 * Java's System.out.printf function can be used to print formatted output. 
	 * The purpose of this exercise is to test your understanding of formatting 
	 * output using printF.
	 */

	public static void formattingOutput() 
	{
		System.out.println("*********************************");
		for(int i=0 ;i<3;i++)
		{
			String s1 = scan.next();
			int x =scan.nextInt();
			System.out.printf("%-15s%03d%n",s1,x);
		}
		
		System.out.println("**********************************");
	}
	
	
	/* Given an integer,N, print its first 10  multiples. 
	 * Each multiple N x i (where 1<=i<=10 ) should be printed on a new line in the form: N x i = result.
	 */
	
	public static void multiply() 
	{
		System.out.println("Enter the interger \n");
		int N = scan.nextInt();
		
		for(int i=1;i<=10;i++) 
		{
			System.out.println(N+" x "+i+" = "+N*i);
		}
		
	}
	
	
}
