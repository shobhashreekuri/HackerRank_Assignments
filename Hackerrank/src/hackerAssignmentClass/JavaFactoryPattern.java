package hackerAssignmentClass;

import java.security.Permission;
import java.util.Scanner;

interface Food{
	public String getType();
}
class Pizza implements Food{
	public	String getType() {
			return "someone ordered food";
		}
}
class Cake implements Food{
	public String getType() {
		return "someone ordered dessert";
	}
}
class FoodType{
	public Food getFood(String order) {
		if("Pizza".equals(order)) {
			return new Pizza();
			}else if("cake".equals(order)) {
				return new Cake();
			}
		return null;
		
	}
}

public class JavaFactoryPattern {

	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();

		try{

			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			//creating the factory
			FoodType foodFactory = new FoodType();
	
			//factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());
	
			
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	 }

	}
	class Do_Not_Terminate {
		 
	    public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}	

