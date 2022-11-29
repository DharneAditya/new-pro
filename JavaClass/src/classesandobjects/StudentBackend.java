package classesandobjects;

public class StudentBackend {

	int id,marks;
	String name,branch;
	
	void setData(int id,int marks,String name,String branch)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.branch=branch;
						
	}
	
	void display()
	{
		System.out.println("Student id= "+id+" marks = "+marks+" name = "+name+" branch = "+ branch);
	}
	
	
}
