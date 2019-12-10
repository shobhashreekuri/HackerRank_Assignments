package hackerAssignmentClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Add{
	@SuppressWarnings("unused")
	void add(int ... a) {
		int r = 0;
		for(int i =0 ;i<a.length;i++) 
		{
			System.out.println(a[i]);
			System.out.println(i== a.length-1 ? "=" : "+" );
			r += a[i];
		}
		System.out.print(r);
	}
}

public class JavaVarArgs {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			int n6 = Integer.parseInt(br.readLine());
			Add ad = new Add();
			ad.add(n1,n2);
			ad.add(n1,n2,n3);
			ad.add(n1,n2,n3,n4);
			ad.add(n1,n2,n3,n4,n5);
			ad.add(n1,n2,n3,n4,n5,n6);
			
		Method[] methods = Add.class.getDeclaredMethods();
		Set<String> set = new HashSet<>();
		boolean overload = false;
		for(int i = 0 ; i < methods.length ;i++) {
			if(set.contains(methods[i].getName())) {
				overload = true;
				break;
			}
			set.add(methods[i].getName());
		}
			if (overload) {
				
				throw new Exception("Overloading not allowed");
				
			}
		}
		catch(Exception e)
			{
			e.printStackTrace();
				
			}
		
	}

}
