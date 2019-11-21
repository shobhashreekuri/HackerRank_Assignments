package hackerAssignmentClass;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDeque {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		HashSet<Integer> set = new HashSet<>();
		int N = scan.nextInt();
		int M = scan.nextInt();
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i< N ; i++) 
		{
			int input = scan.nextInt();
			deque.add(input);
			set.add(input);
			if (deque.size() == M) 
			{
				if (set.size() > max)
					max= set.size();
				int first = deque.remove();
				if(!deque.contains(first))set.remove(first);
			}
		}
		System.out.println(max);
	}

}
