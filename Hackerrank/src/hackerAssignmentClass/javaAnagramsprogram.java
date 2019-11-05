package hackerAssignmentClass;

import java.util.Scanner;

public class javaAnagramsprogram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		String B = scan.nextLine();
		scan.close();
		boolean ret = anagramProgram(A,B);
		if (ret) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("not Anagrams");
		}
			
	}

	
	public static boolean anagramProgram(String A, String B) {
		if (A.length() != B.length()) {
			return false;
		}
		int[] c = new int[26];
		int[] d = new int[26];
		A = A.toLowerCase();
		B = B.toLowerCase();
		
		for(int i= 0; i<= A.length() ;i++) {
			c[A.charAt(i) - 'A']++;
			d[B.charAt(i) - 'A']++;
		}	
		for (int i=0;i<26;i++) {
		if(c[i] != d[i]) {
			return false;
		}
	}
		
		return true;
		
	}
}
