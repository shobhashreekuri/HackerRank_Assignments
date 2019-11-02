package hackerAssignmentClass;

import java.util.Scanner;

public class javaStringExample {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String A = scan.nextLine();
		String B = scan.nextLine();
		int Sum = A.length() + B.length();
		System.out.println("Sum of length of 2 String:  " +Sum);
		int compare = A.compareTo(B);
		
		if (compare > 0) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("NO");
		}
		
		String Atemp = A.substring(0,1).toUpperCase()+A.substring(1);
		String Btemp = B.substring(0, 1).toUpperCase()+B.substring(1);
		System.out.println(Atemp + " " + Btemp);
		
		

	}
}
