package hackerAssignmentClass;

import java.util.*;

public class javaArrayList {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<List<Integer>> lines = new ArrayList<List<Integer>>();
		int n = scan.nextInt();
		for (int i=0 ;i<n;i++) {
			List<Integer> line = new ArrayList<Integer>();
			int d = scan.nextInt();
			for(int j=0;j<d;j++) {
				line.add(scan.nextInt());
			}
			lines.add(line);
		}
		int q= scan.nextInt();
		for(int i=0 ;i<q;i++)
		{
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(y > lines.get(x-1).size()) 
			{
				System.out.println("ERROR!");
			}
			else 
			{
				System.out.println(lines.get(x-1).get(y-1));
			}
		}
		
		
		scan.close();
	}

}
