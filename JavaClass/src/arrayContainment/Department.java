package arrayContainment;

public class Department {

	
	int id,empNum;
	String name;
	
	Department(int id,int empNum,String name)
	{
		this.empNum=empNum;
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return empNum+" "+id+" "+name;
	}
}
