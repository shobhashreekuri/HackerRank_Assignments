package hackerAssignmentClass;

import java.util.Scanner;

public class jvaStringTokens {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] a=scan.nextLine().trim().split("[ !,?\\._'@]+",0);
        if(a.length==1&&a[0].equals("")){
            System.out.println(0);
        }else{
            System.out.println(a.length);
            for(String s:a)System.out.println(s);
        scan.close();
        }
	}
	

}
