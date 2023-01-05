package arrayCrudOperation;

public class Student {

	private int id,marks;
	private String name,email,contact,dept;
	
	Student()
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.email=email;
		this.contact=contact;
		this.dept=dept;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString ()
	{
		return id+" "+marks+" "+name+"  "+email+"  "+contact+" "+dept;
	}
	
	
	
	
	
}
