package hackerAssignmentClass;

import java.util.ArrayList;
import java.util.Scanner;

class ranker{}
class Rockstar{   }
class Hacker{}


public class JavainstanceofProgram {
	
	static String count(ArrayList<Integer> mylist){
	      int a = 0,b = 0,c = 0;
	      for(int i = 0; i < mylist.size(); i++){
	         Object element=mylist.get(i);
	         if(element instanceof ranker)
	            a++;
	         if(element instanceof Rockstar)
	            b++;
	         if(element instanceof Hacker)
	            c++;
	      }
	      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
	      return ret;
	   }

	 static Scanner sc = new Scanner(System.in);
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		 ArrayList mylist = new ArrayList();
		
	      int t = sc.nextInt();
	      for(int i=0; i<t; i++){
	         String s=sc.next();
	         if(s.equals("Student"))mylist.add(new ranker());
	         if(s.equals("Rockstar"))mylist.add(new Rockstar());
	         if(s.equals("Hacker"))mylist.add(new Hacker());
	      }
	      System.out.println(count(mylist));
	   }
	


}
