package hackerAssignmentClass;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityProgram {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		BigInteger N = new BigInteger(scan.next());
		System.out.println(N.isProbablePrime(10)? "Prime":"Not Prime");

	}

}
