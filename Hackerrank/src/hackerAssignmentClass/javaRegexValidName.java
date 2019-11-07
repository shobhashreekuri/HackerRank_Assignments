package hackerAssignmentClass;

import java.util.Scanner;

class javaRegexValidName {
	
public static final Scanner Scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(Scan.nextLine());
		while(n-- != 0 )
		{
			String username = Scan.nextLine();
			if(username.matches(validUsername.regularexpression))
			{
				System.out.println("Valid Username");
			}
			else
			{
				System.out.println("Invalid Username");
			}
			
		}

	}

}
class validUsername{
	
	
	public static final String regularexpression = "^[a-zA-Z][\\w]{7,29}$";
	
}
