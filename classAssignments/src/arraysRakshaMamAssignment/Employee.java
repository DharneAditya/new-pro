package arraysRakshaMamAssignment;

public class Employee {

	
	private int id ;
	private String name;
	private int salary;
	private String dept;
	
	Employee(int id,int salary,String dept,String name)
	{
		this.id=id;
		this.dept=dept;
		this.salary=salary;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString()
	{
		return id+" "+salary+" "+dept+" "+name; 
	}
	
	
	
	
	
	
}
