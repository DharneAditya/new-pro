package arrayCrudOperation;

public class StudentL {

	private int id;
	private String name,email,contact,dept;
	
	StudentL(int id,String name,String email,String contact,String dept)
	{
		this.id=id;
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

	public void setConatact(String contact) {
		this.contact = contact;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

	public String toString()
	{
		return id+" "+name+" "+email+" "+contact+" "+dept;
	}
	
}
