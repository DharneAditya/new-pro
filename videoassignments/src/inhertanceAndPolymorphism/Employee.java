package inhertanceAndPolymorphism;

public class Employee {
	
   int id,salary;
   String name;
   Address a;
   
   
	Employee(int id , int salary,String name,Address a)
	{
		this.a=a;
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary+" "+a;
	}
	
	
	
}
