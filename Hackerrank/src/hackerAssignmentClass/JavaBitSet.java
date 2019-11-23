package hackerAssignmentClass;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
	static Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		int N = scan.nextInt(); // Length Of B1 and B2
		int M = scan.nextInt(N);
		BitSet[] B = new BitSet[3];
		for(int i = 0 ;i < B.length; i++) {
			B[i] = new BitSet(N);
		}
		
		for(int i = 0 ; i < M ; i++) {
			String operation = scan.next();
			int arg1 = scan.nextInt();
			int arg2 = scan.nextInt();
			if(operation.equals("AND")) {
				B[arg1].and(B[arg2]);
			}else if(operation.equals("OR")){
				B[arg1].or(B[arg2]);
			}else if(operation.equals("XOR")) {
				B[arg1].xor(B[arg2]);
			}else if(operation.equals("FLIP")) {
				B[arg1].flip(arg2);
			}else if (operation.equals("SET")) {
				B[arg1].set(arg2);
			}
			System.out.println(B[1].cardinality() + " " + B[2].cardinality());
		}
		scan.close();
	}

}