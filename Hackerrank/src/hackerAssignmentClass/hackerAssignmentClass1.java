package hackerAssignmentClass;

import java.util.Scanner;

public class hackerAssignmentClass1 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		printOutput();
		scanInput();
		ifElse();
		printIO();
		scan.close();
	}
	
	//Hacker rank Assignment1
	public static void printOutput() 
	{
		
		System.out.println("Hello, World");
		System.out.println("Hello, Java");
		
	}

	//Hacker rank Assignment2
	public static void scanInput() 
	{
		System.out.println("1st input: ");
		int myint1 = scan.nextInt();
		System.out.println("2nd input: ");
		int myint2 = scan.nextInt();
		System.out.println("3rd input: ");
		int myint3 = scan.nextInt();
		
		System.out.println("1st input: " +myint1);
		System.out.println("2nd input: " +myint2);
		System.out.println("3rd input: " +myint3);
		
		}
	
	/*Task
	Given an integer, , perform the following conditional actions:
	If n is odd, print Weird
	If n is even and in the inclusive range of 2 to 5 , print Not Weird
	If n is even and in the inclusive range of 6 to 20 , print Weird
	If n is even and greater than 20 , print Not Weird
	 */
	private static void ifElse() {
	
		System.out.println("Enter the number: ");
		int N = scan.nextInt();
		//24scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (N%2 == 1) {
			System.out.println("Weird");
		}else if(N%2==0 && (N>=2 && N<=5)) {
			System.out.println("Not Weird");
		}else if(N%2==0 && (N>=6 && N<=20)) {
			System.out.println("Weird");
		}else if(N%2==0 && N>20) {
			System.out.println("Not Weird");
		}else {
			System.out.println("End Of Loop");
		}
		
	}
	
	/*In this challenge, you must read an integer, a double, and a String from stdin, 
	 * then print the values according to the Output Format.
	 */
	public static void printIO() 
	{
		System.out.println("Please enter a interger value: ");
		int i =scan.nextInt();
		System.out.println("Please enter a Double value: ");
		double d = scan.nextDouble();
		scan.nextLine();
		System.out.println("Please enter a String: ");
		String s = scan.nextLine();
		
		System.out.println("String: " +s);
		System.out.println("Double: " +d);
		System.out.println("Int: " +i);
		
	}
}
