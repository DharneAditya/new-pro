package inheritanceOverriding;

public class Person {
int age;
String name,contact,gender;

public void setAge(int age)
{
	this.age=age;
	
}

public void setName(String name)
{
	this.name=name;
}

public void setContact(String contact)
{
	this.contact=contact;
}

public void setGender(String gender)
{
	this.gender=gender;
}


void display()
{
	System.out.println(name+" "+age+" "+gender+" "+contact);
}






}
