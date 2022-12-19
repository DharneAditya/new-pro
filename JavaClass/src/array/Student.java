package array;

public class Student {

	int rollNo,marks;
	String name,dept;
	
	
	Student(int rollNo,int marks,String name,String dept)
	{
		this.dept=dept;
		this.rollNo=rollNo;
		this.marks=marks;
		this.name=name;
	}
	
	public String toString()
	{
		return rollNo+" "+marks+" "+name+" "+dept;
	}
}
 