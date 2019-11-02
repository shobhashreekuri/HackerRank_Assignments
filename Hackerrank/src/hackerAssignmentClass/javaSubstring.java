/*
 * Given a string,s, and two indices,start and end, print a substring consisting of all 
 * characters in the inclusive range from start to end-1. You'll find the String class'substring
 * method helpful in completing this challenge.
 */

package hackerAssignmentClass;

import java.util.Scanner;

public class javaSubstring {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String S = scan.next();
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		System.out.println(S.substring(start, end));
	}
	
	

}
