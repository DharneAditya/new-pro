package constructorsAndPolymophism;

public class Student {
	
	int rollNo,che,phy,maths;
	String name;
	
	Student()
	{
		
		this( 121,60, 70, 80, "Nilesh");
		
		
	}
	
	Student(int rollNo,int che,int phy,int maths,String name)
	{
		this.rollNo=rollNo;
		this.che=che;
		this.phy=phy;
		this.maths=maths;
		this.name=name;
		
		
	}

	
	public void display()
	{
		System.out.println("Student Roll no "+rollNo+"\nStudent Name"+name+"\nMarks in che "+che+"\nMarks in phy "+phy+"\nMarks in maths "+maths);
		System.out.println();
	}
}
