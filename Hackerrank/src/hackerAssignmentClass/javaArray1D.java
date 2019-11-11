package hackerAssignmentClass;

import java.util.Scanner;

public class javaArray1D {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();  //n = size of the array
		int[] a = new int[n];
		for(int i = 0 ;i<n;i++) {
			a[i] = scan.nextInt(); 
			}
		scan.close();
		for (int i = 0 ; i< a.length; i++) {
			System.out.println("print array of numbers:" +a[i]);
		}

	}

}
