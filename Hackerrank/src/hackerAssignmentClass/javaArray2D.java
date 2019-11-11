package hackerAssignmentClass;

import java.util.Scanner;

public class javaArray2D {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] arr = new int[6][6];
		int max_sum = Integer.MIN_VALUE;
		for(int i=0 ; i<6 ;i++) {
			 String[] arrRowItems = scan.nextLine().split(" ");
			 scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j=0;j<6;j++) {
				int arr_items = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arr_items;
			}
		}
		scan.close();
		for(int i=0; i<=3;i++) {
			for(int j =0 ; j<=3; j++) {
				int topRow = arr[i][j]+arr[i][j+1]+arr[i][j+2];
				int middleRow =arr[i+1][j+1];
				int lastRow =arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				int currentSum = topRow+middleRow+lastRow;
				if(currentSum > max_sum) {
					max_sum = currentSum;	
				}
			}
		}
		
			System.out.println(max_sum);
	}

}
