package array;
import java.util.Scanner;
public class StudentArraysobjectExample {

	public static void main(String[] args) {
		
		Student stud[]=new Student [5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Put Student roll no");
			int rollno=sc.nextInt();
			System.out.println("Put Student name");
			String name=sc.next();
			System.out.println("Put Student dept");
			String dept=sc.next();
			System.out.println("Put Student marks");
			int marks=sc.nextInt();
			
			stud[i]=new Student(rollno,marks,name,dept);
			
			
		}
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		
		

	}

}
