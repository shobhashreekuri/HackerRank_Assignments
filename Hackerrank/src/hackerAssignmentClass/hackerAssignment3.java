package hackerAssignmentClass;

import java.util.Scanner;

public class hackerAssignment3 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		seriesLoop();
		
		scan.close();

	}

	/*
	 *  Task You are given q queries in the form of a, b, and n For each query, 
	 * print the series corresponding to the given a, b, and n values as a 
	 * single line of n space-separated integers.Input Format.The first line 
	 * contains an integer, q denoting the number of queries.
	 * Each line i of the q subsequent lines contains three space-separated integers 
	 * describing the respective ath bth and nth values for that query.
	 */
	
	public static void seriesLoop() {
		
		int T = scan.nextInt(); //No. of test cases
		for(int i=0; i<T; i++) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			int cal = a;
			
			for (int j=0; j<n; j++) {
				
				cal +=(Math.pow(2,j)*b);
				System.out.print(cal +" " );
				
			}
			
			System.out.println();
					
		}
		
		
	}
	
}
