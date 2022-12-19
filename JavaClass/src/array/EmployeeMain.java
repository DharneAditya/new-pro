package array;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e[]=new Employee[10];
		Scanner sc=new Scanner(System.in);
		
		for (int i =0;i<10;i++)
		{
			System.out.println("Enter employee id ");
			int id =sc.nextInt();
			System.out.println("Enter employee name");
			String name=sc.next();
			System.out.println("Enter employee dept");
			String dept=sc.next();
			System.out.println("Enter eployee salary");
			int salary=sc.nextInt();
			
			e[i]=new Employee(id,salary,name,dept);
			
			
		}
		
		for(Employee a:e)
		{
			if(a.salary>60000)
			{
				System.out.println(a);
			}
			
			if(a.dept.equals("hr"))
			{
				a.increment();
				System.out.println(a);
			}
		}
		
		
		

	}

}
