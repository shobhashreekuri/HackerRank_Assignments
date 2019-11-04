package hackerAssignmentClass;

import java.util.Scanner;

public class javaSubstringComparisons {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int k = scan.nextInt();
		scan.close();
		System.out.println(smallestAndLargest(s,k));
	}

	
	public static String smallestAndLargest(String S ,int K) {
		
		String smallest = "";
		String largest = "";
		smallest = S.substring(0,K);
		largest = S.substring(0,K);
		for(int i=0; i <= S.length()-K;i++) {
			String Str = S.substring(i,K+i);
			if(smallest.compareTo(Str)>0) {
				smallest = Str; 
			}
			else if(largest.compareTo(Str)<0) {
				largest = Str;
			}
		}
		return smallest +"\n"+largest;
	}
}
