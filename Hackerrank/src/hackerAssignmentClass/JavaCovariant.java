package hackerAssignmentClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower{
	String whatsYourName() {
		return "I have many name and type";
	}
}
class Jasmine extends Flower{
	String whatsYourName() {
		return "Jasmine";
	}
}
class Lily extends Flower{
	String whatsYourName() {
		return "Lily";
	}
}
class Region {
	Flower yourNationalFlower() {
		return new Flower();
	}
}
class WestBengal extends Region{ 
	Jasmine yourNationalFlower() {
	return new Jasmine();	
	}
}
class AndherPradesh extends Region{
	Lily yourNationalFlower() {
		return new Lily();
	}
}

public class JavaCovariant {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String s =   read.readLine().trim();
		Region region = null;
		switch(s) {
		case  "WestBengal":
			region = new WestBengal();
			break;
		case "AndherPradesh":
			region = new AndherPradesh();
			break;
		}
		Flower flower = region.yourNationalFlower();
		System.out.println(flower.whatsYourName());

	}

}
