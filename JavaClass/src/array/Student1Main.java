package array;
import java.util.Scanner;
public class Student1Main {

	public static void main(String[] args) {
		
		Student1 stud[]=new Student1[5];
		
		Scanner sc=new Scanner (System.in);
		
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
			
			Student1 s=new Student1();
			s.setDept(dept);
			s.setMarks(marks);
			s.setName(name);
			s.setRollNo(rollno);
			
			stud[i]=s;
		}
		
		for(Student1 s:stud)
		{
			System.out.println(s.getDept()+" "+s.marks+" "+s.getName()+" "+s.getRollNo());
		}
	}

}
