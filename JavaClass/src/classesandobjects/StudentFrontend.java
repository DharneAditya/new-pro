package classesandobjects;
import java.util.Scanner;
public class StudentFrontend {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter student 1 Imformation");
		System.out.println("Enter the student id");
		int id =sc.nextInt();
		System.out.println("Enter the student name");
		String name=sc.next();
		System.out.println("Enter the student branch");
		String branch=sc.next();
		System.out.println("Enter the student marks");
		int marks=sc.nextInt();
		
		
		StudentBackend s1=new StudentBackend();
		s1.setData(id,marks, name, branch);
		
		System.out.println("Enter Student 2 Imformation");
		
		System.out.println("Enter the student id");
		int id2 =sc.nextInt();
		System.out.println("Enter the student name");
		String name2=sc.next();
		System.out.println("Enter the student branch");
		String branch2=sc.next();
		System.out.println("Enter the student marks");
		int marks2=sc.nextInt();
		
		StudentBackend s2=new StudentBackend();
		s2.setData(id2, marks2, name2, branch2);
		s2.display();
		s1.display();
	}

}
