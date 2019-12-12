package hackerAssignmentClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Prime{
	void checkPrime(int... numbers) {
		for(int num :numbers) {
			if(isPrime(num)) {
				System.out.print(num +" ");
			}
		}
		System.out.println();
	}
	boolean isPrime(int n) {
		if(n < 2) {
			return false;
		}else if(n == 2) {
			return true;
		}else if (n%2==0) {
			return false;
		}
		int srqt = (int) Math.sqrt(n);
		for(int i = 3 ;i<= srqt;i+=2) {
			if(n%i == 0) {
				return false;
			}
		}
			return true;
	}
}

public class JavaPrimeCheckerProgram {

	public static void main(String[] args) throws Exception {
		try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n1 = Integer.parseInt(br.readLine());
	int n2 = Integer.parseInt(br.readLine());
	int n3 = Integer.parseInt(br.readLine());
	int n4 = Integer.parseInt(br.readLine());
	int n5 = Integer.parseInt(br.readLine());
	Prime p = new Prime();
	p.checkPrime(n1);
	p.checkPrime(n1,n2);
	p.checkPrime(n1,n2,n3);
	p.checkPrime(n1,n2,n3,n4);
	p.checkPrime(n1,n2,n3,n4,n5);
	Method[] methods = Prime.class.getDeclaredMethods();
	Set<String> set= new HashSet<>();
	boolean overload = false;
	for(int i = 0; i<methods.length; i++) {
		if(set.contains(methods[i].getName())) {
			overload = true;			
		}
		set.add(methods[i].getName());
	}
		if (overload) {
			throw new Exception("overloading not allowed ");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
