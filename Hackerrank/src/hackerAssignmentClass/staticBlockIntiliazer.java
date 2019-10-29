package hackerAssignmentClass;

import java.util.Scanner;

public class staticBlockIntiliazer {
	static int B,H;
	static boolean flag = true;
	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		scan.close();
		
		if(B<0 || H<0) {
			System.out.println("Java.lang.Exception: Breath and Height must be positive number");
			flag = false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				if(flag) {
				int	area = B*H;
				System.out.print("Area of parallelogram: " +area);
				}
	}

}
