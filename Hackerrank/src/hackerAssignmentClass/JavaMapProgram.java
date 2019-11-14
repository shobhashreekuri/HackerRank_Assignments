package hackerAssignmentClass;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMapProgram {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
	
		int n = scan.nextInt(); // no. of entries
		scan.nextLine();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0 ; i<n ;i++) {
			String name = scan.next();
			int phone = scan.nextInt();
			map.put(name, phone);
			scan.nextLine();
			}
				while(scan.hasNext()) 
				{
					String s = scan.nextLine();
					if (map.containsKey(s)) 
					{
						System.out.println(s + "=" + map.get(s));
					}
					else
					{
						System.out.println("Not found");
					}
				}
	}

}
