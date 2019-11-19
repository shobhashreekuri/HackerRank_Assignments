package hackerAssignmentClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

 class Student{
	private int Id;
	private String Fname;
	  private double cgpa;
	 public Student(int id,String Fname,double cgpa) {
		 super();
		 this.Id = id;
		 this.Fname = Fname;
		 this.cgpa = cgpa;
		 }
		public int getId() 
		 {
		 return Id;
		 }
		public String getFname() {
			 return Fname;
		 }
		public double getcgpa() 
		 {
			 return cgpa;
		 }	 
		 
	 }
	 
public class JavaSort {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int testcase = Integer.parseInt(scan.nextLine());
		ArrayList<Student> StudentList = new ArrayList<Student>();
		while(testcase > 0 ) {
			int id = scan.nextInt();
			String fname = scan.next();
			double cgpa = scan.nextDouble();
			Student st = new Student(id,fname,cgpa);
			StudentList.add(st);
			testcase--;
			}
		Collections.sort(StudentList, Comparator.comparing(Student :: getcgpa).reversed().thenComparing(Student :: getFname).thenComparing(Student :: getId));
		 	for(Student st : StudentList) {
		 		System.out.println(st.getFname());
		 		
		 	}
		

	}

}
