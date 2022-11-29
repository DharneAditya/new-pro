package classesandobjects;
import java.util.Scanner;
public class GlobalEmployeeFrontend {

	public static void main(String[] args) {
		
		int id,salary;
		long contact;
		String name,dept;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Employee");
		int num=sc.nextInt();
		GlobalEmployeeBackend E1=new GlobalEmployeeBackend();
		
		for (int i=1;i<=num;i++)
		{
			System.out.println("Enter Full details of the employee");
			
			System.out.println("Enter name of the employee");
			name=sc.next();
			System.out.println("Enter Id Of the emplyee");
			id=sc.nextInt();
			System.out.println("Enter dept of the employee");
		    dept=sc.next();
			System.out.println("Enter Salary of the employee ");
			salary=sc.nextInt();
			System.out.println("Enter contact of the employee ");
			contact=sc.nextInt();
			
			
			
			
			E1.setdata(id, salary, contact, name, dept);
			
			System.out.println(E1);
			
		}
		
		
	}
}