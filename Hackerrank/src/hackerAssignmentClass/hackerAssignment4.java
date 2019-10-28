package hackerAssignmentClass;

import java.util.Scanner;

public class hackerAssignment4 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
			permitiveDataTypes();
			scan.close();
	}
	
	/* Given an input integer, you must determine which primitive data types are 
	 * capable of properly storing that input.
	 */
	
	private static void permitiveDataTypes()
	{
		int t = scan.nextInt();
		
		for(int i=0 ;i<t; i++) {
			try {
		
					long num = scan.nextLong();
					System.out.println( num +"Can be Fitted");
					if(num>= -128 && num<=127) 
					{
						System.out.println("* byte");
					}
					if (num>= -(Math.pow(2,15)) && num<=(Math.pow(2, 15)-1))
					{
						System.out.println("* short");
					}
					if (num>= -(Math.pow(2,31)) && num<= (Math.pow(2, 31)-1))
					{
						System.out.println("* int");
					}
					if (num>= -(Math.pow(2, 63)) && num<=(Math.pow(2, 63)-1))
					{
						System.out.println("* long");					}
					
				}
			
			catch(Exception e)
			{
				System.out.println(scan.next() +"cannot be fitted anywhere.");
			}
		}
	}
}


