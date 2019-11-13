package hackerAssignmentClass;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaList {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int N = scan.nextInt();	//line of integers
		LinkedList<Integer> list = new LinkedList<>(); //list in the array
		for(int i = 0 ; i < N ; i++) {
			int value = scan.nextInt();
			list.add(value);
		}
		 // Perform queries on Linked List //
		int Q = scan.nextInt();
		for(int i = 0 ; i < Q ; i++) {
			String action = scan.next();
			if(action.equals("Insert"))
			{
				int index = scan.nextInt();
				int value = scan.nextInt();
				list.add(index, value);
			}else 
			{
				int index = scan.nextInt();
				list.remove(index);
				
			}
		}
		
	scan.close();
			for(Integer num:list)
				System.out.print(num +" ");
	}

}
