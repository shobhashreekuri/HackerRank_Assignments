
package hackerAssignmentClass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class javaRegexDuplicate {

	public static void main(String[] args) {
	
		String RegularExpression = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern p = Pattern.compile(RegularExpression, Pattern.CASE_INSENSITIVE);
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		while(n-- > 0) 
		{
			String in = scan.nextLine();
			Matcher m = p.matcher(in);
			
			// Check for subsequences of input that match the compiled pattern
			while(m.find()) 
			{
				in = in.replaceAll(m.group(), m.group(1));
			}
			System.out.println(in);
		}
		scan.close();
	
	}

}
