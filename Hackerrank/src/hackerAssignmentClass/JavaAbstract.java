package hackerAssignmentClass;

import java.util.Scanner;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}
	class MyBook extends Book{
	void setTitle(String s){
		title= s;
			
		}
		
	}
	


public class JavaAbstract {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String title = scan.next();
		MyBook B = new MyBook();
		B.setTitle (title);
		System.out.println("the title is:" +B.getTitle());
		scan.close();
		}

}
