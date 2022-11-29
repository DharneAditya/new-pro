package constructors;

public class EmployeeStaticBackend {

	int id,salary;
	String name,dept;
	static String Companyname="Infosys";
	
	 EmployeeStaticBackend(int id,int salary,String name,String dept)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.dept=dept;
				
	}
	
	public String toString()
	{
		return id+" "+salary+" "+name+" "+dept;
	}
	
}
