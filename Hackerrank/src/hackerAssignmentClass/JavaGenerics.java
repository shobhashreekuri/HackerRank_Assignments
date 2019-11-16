package hackerAssignmentClass;

import java.lang.reflect.Method;

public class JavaGenerics {

	public static void main(String[] args) {
		Printer myPrinter = new Printer();
		Integer[] intArray = {1,2,3,4};
		String[] strArray = {"hello","world"};
		 myPrinter.printArray(intArray);
	        myPrinter.printArray(strArray);
	        int count = 0;

	        for (Method method : Printer.class.getDeclaredMethods()) {
	            String name = method.getName();

	            if(name.equals("printArray"))
	                count++;
	        }

	        if(count > 1)System.out.println("Method overloading is not allowed!");
	      
	    }
		
		
		
	}

	 class Printer {
		
		public <inputType> void printArray(inputType[] array) {
			
			for(int i = 0 ;i< array.length ;i++) {
				System.out.println(array[i]);
			}
			
		}
		
	}

