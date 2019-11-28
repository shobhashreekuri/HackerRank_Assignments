package hackerAssignmentClass;

class Animal{
	void walk() {
		System.out.println("I Am Walking");
	}
}
class Bird extends Animal{
	void fly() {
		System.out.println("I Am Flying");
	}
	void sing() {
		System.out.println("I am Singing");
	}
}

public class JavaInheritence1 {

	public static void main(String[] args) {
		Bird bd = new Bird();
		bd.walk();
		bd.fly();
		bd.sing();

	}

}
