package inhertanceAndPolymorphism;

public class Employee2 {

	int empid,salary;
	String empname;
	Address2 b;
	
	
	public void getEmployeeDetails(int empid,int salary,String empname,Address2 b)	
	{
		this.b=b;
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		
	}
	
	public void showEmployeeDetails()
	{
		System.out.println(empid+" "+salary+" "+empname+" "+b);
	}
}
