package hackerAssignmentClass;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		BigInteger A = new BigInteger(scan.next());
		BigInteger B = new BigInteger(scan.next());
		System.out.println(A.add(B));
		System.out.println(A.multiply(B));

	}

}
