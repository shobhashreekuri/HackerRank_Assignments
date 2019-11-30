package hackerAssignmentClass;

import java.util.Scanner;

interface Arthimetic
{
	int divisor_sum(int n);	
}
class MyCalculation implements Arthimetic{
	public int divisor_sum(int n)
	{
		int result = 0;
		for(int i = 1 ;i <= n ;i++) {
			if(n % i == 0) {
				result += i; 
			}
		}
		return result;
		
	}
}

public class JavaInterface {

	public static void main(String[] args) 
	{
		MyCalculation cal = new MyCalculation();
		System.out.print("I implemented : ");
		ImplementedInterfaceNames(cal);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        System.out.print(cal.divisor_sum(n) + "\n");
      	scan.close();
    }
		 



	/*
     *  ImplementedInterfaceNames method takes an object and prints the name of the
     *   interfaces it implemented
     */
	static void ImplementedInterfaceNames(Object o){
        @SuppressWarnings("rawtypes")
		Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
	
}



