package hackerAssignmentClass;

import java.util.Scanner;

public class javaPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		String rev = new StringBuilder(str).reverse().toString();
		if (rev.equals(str)) {
			System.out.println("YES");
			}
		else {
			System.out.println("NO");
		}
	}

	
}
