package hackerAssignmentClass;
class Arithmetic {
	int add(int a ,int b) {
		int sum = a+b;
		return sum;
	}
}
class Adder extends Arithmetic{
	
}

public class JavaInherutence2 {

	public static void main(String[] args) {
		// Create a new Adder object
		Adder ad = new Adder();
		 // Print the name of the superclass on a new line
		System.out.println("My Superclass:" + ad.getClass().getSuperclass().getName());
		// Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
		System.out.print(ad.add(10, 2) + " " + ad.add(2, 0)+ " " + ad.add(2, 3)+"\n");

	}

}
