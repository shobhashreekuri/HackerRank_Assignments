/*
 * The challenge here is to read n lines of input until you reach EOF, 
 * then number and print all n lines of content
 * 
 * Input Format Read some unknown  lines of input from stdin(System.in) until you reach EOF;
 *  each line of input contains a non-empty String.
 *  
 *  Output Format For each line, print the line number, followed by a single space,
 *   and then the line content received as input.
 */


package hackerAssignmentClass;

import java.util.Scanner;

public class hackerRankEndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner N = new Scanner(System.in);
		int line_no = 0;
			while(N.hasNext()) {
				System.out.println(++line_no + " " + N.nextLine());
				}
			N.close();
			
		
	}
	

}
