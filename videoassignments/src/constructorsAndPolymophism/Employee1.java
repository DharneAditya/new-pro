package constructorsAndPolymophism;

public class Employee1 {
	
	int empId,basicSalary;
	double hra,da,grossSalary;
	String name;
	
	Employee1()
	{
		
		empId=1234;
		name="ramesh";
		basicSalary=10000;
		hra= (0.35*basicSalary);
		da=(0.20*basicSalary);
		grossSalary=(hra+da+basicSalary);
	}
	
    Employee1(int empId,int basicSalary,String name)
	{   
    	this.empId=empId;
		this.name=name;
		this.basicSalary=basicSalary;
	    hra=0.35*basicSalary;
		da=0.20*basicSalary;
		grossSalary=hra+da+basicSalary;
	}
    
    public void showDetails()
    {
    	
    System.out.println("basic salary is  "+basicSalary+"\nName is "+name+"\nempId "+empId+"\nhra is "+hra+"\nda is "+da+"\nGrossSalary is "+grossSalary);
    
    }

}
