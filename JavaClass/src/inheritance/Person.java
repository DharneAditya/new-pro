package inheritance;

public class Person {

	private int id,age;
	private String name,contact;
	private Adress a;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public String getContact()
	{
		return contact;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	
	public Adress getA()
	{
		return a;
	}
	public void setA(Adress a)
	{
		this.a=a;
	}
}
