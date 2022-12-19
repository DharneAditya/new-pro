package arraysRakshaMamAssignment;
import java.util.Scanner;
public class StudentDepartmentMain {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		/*
		 * Department d[]=new Department [2];
		 * 
		 * for(int i=0;i<d.length;i++) { System.out.println("Enter department name");
		 * String name =sc.next(); System.out.println("Enter department id"); int
		 * id=sc.nextInt(); System.out.println();
		 * System.out.println("Enter Student Imformation  ");
		 * 
		 * Student s[]=new Student[5];
		 * 
		 * int srno=1; for(int j=0;j<s.length;j++) {
		 * 
		 * System.out.println("Enter Student id " +srno); int id1=sc.nextInt();
		 * System.out.println("Enter Student Name"); String name1=sc.next(); s[j]=new
		 * Student (id,name); srno++; }
		 * 
		 * d[i]=new Department (id,name,s);
		 * 
		 * }
		 * 
		 * for(Department d2:d) {
		 * 
		 * System.out.println(d2); }
		 */
		
		Department d2[]=new Department [5];
		int idi=1;
		for(int i=0;i<d2.length;i++)
		{
			System.out.println("Enter department name");
			String name =sc.next();
			System.out.println("Enter department id");
			int id=sc.nextInt();
			System.out.println();
			
			Student s[]=new Student[20];
			
			
			
			
			for(int j=0;j<s.length;j++)
			{
								
				
			 String  namee="Student  ";
			 s[j]=new Student (idi,namee);       
				idi++;				
			}
			
			
			d2[i]=new Department (id,name,s);
			
		}
		
		
		
		for(Department dp:d2)
		{
			System.out.println(dp);
		}
		

	}

}
