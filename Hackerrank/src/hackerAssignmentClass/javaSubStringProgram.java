package hackerAssignmentClass;

import java.util.Scanner;

public class javaSubStringProgram 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		int count=0;
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				int sum=0;
				for(int k=i;k<j;k++) {
					sum = arr[k]+sum;
					if(sum<0) {
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
