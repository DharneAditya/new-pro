package arraysRakshaMamAssignment;

import java.util.Scanner;


public class EmployeeMain {

	
		Scanner sc=new Scanner (System.in);
		
		Employee e[]=new Employee[2];
		
		
		
		public void insertData()
		{
			System.out.println("Put employee data");
			for(int i=0;i<e.length;i++)
			{
				System.out.println("Enter Employee id ");
				int id=sc.nextInt();
				System.out.println("Enter Employee name");
				String name=sc.next();
				System.out.println("Enter Employee Salary ");
				int salary=sc.nextInt();
				System.out.println("Enter Employee dept ");
				String dept=sc.next();
		         
				Employee em=new Employee(id ,salary,name,dept);
				em.setId(id);
				em.setSalary(salary);
				em.setName(name);
				em.setDept(dept);
				e[i]=em;
				
			}
			
		}
		
		public void viewData()
		{
			for(int i=0;i<e.length;i++)
			{
				System.out.println("id "+e[i].getId());
				System.out.println("salary "+e[i].getSalary());
				System.out.println("name "+e[i].getName());
				System.out.println("dept "+e[i].getDept());
			}

		}
		
		public void viewSpecificData( )
		{
			System.out.println("Enter Specific id");
			int speId=sc.nextInt();
			for(int i=0;i<e.length;i++)
			{
				if(e[i].getId() == speId)
					
			System.out.println(" Specific Id"+e[i].getId());	
			}
		}
		
		public void updateData()
		{
			for(int i=0;i<e.length;i++)
			{
				System.out.println("Enter Employee id ");
				int id=sc.nextInt();
				System.out.println("Enter Employee Salary ");
				int salary=sc.nextInt();
				e[i].setId(id);
				e[i].setSalary(salary);
			}
		}
		
		public void deletData()
		{
		                                  
		}
		
}
