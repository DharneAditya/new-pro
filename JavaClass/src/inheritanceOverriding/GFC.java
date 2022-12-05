package inheritanceOverriding;

public class GFC {

	String name,middleName;
	static String surname="Dharne";
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMiddleName(String middleName)
	{
		this.middleName=middleName;
	}
	
	void display ()
	{
		System.out.println(name+" "+middleName+" "+GFC.surname);
	}
}

class Father extends GFC
{
 String name1;
		
	public void setName1(String name1)
	{
		this.name1=name1;
	}
	
	void display()
	{
		super.display();
		System.out.println(name1+" "+super.name+" "+GFC.surname);
		
	}
}

class Child extends Father
{

	String name2;
	public void setName2(String name2)
	{
		this.name2=name2;
	}
	
	void display()
	{
		super.display();
		
		System.out.println(name2+" "+super.name1+" "+GFC.surname);
	}
}
