package array;

public class Employee {

	int id,salary;
	String name,dept;
	
	Employee(int id,int salary,String name,String dept)
	{
		this.id=id;
		this.dept=dept;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id+" "+dept+" "+name+" "+salary;
	}
	
	void increment()
	{
		int inc=((salary*10)/100);
		salary=salary+inc;
	}
}
