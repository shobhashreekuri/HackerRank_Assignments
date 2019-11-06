package hackerAssignmentClass;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class javaRegexProgram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int testcase = Integer.parseInt(in.nextLine());
		while(testcase>0) {
			String pattern = in.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			}
			catch(PatternSyntaxException e) {
				System.out.println("Not Valid");
			}
			testcase--;
		}

	}

}
