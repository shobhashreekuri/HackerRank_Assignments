package hackerAssignmentClass;
import java.security.Permission;
import java.util.*;

public class classIntToSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Do_Not_Terminate.forbidExit();
		try {
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			scan.close();
			//String s = Interger.toString(i);
			String s = String.valueOf(i);
			if(i== Integer.parseInt(s)) {
				System.out.println("Good Job");
			}
			else {
				System.out.println("wrong answer");
			}
			
	}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	
		
		
	}
	 //The following class will prevent you from terminating the code using exit(0)!
	static class Do_Not_Terminate {
			 
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



}
