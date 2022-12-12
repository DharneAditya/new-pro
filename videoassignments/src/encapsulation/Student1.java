package encapsulation;

public class Student1 {

	private int id=123;
	private String name="ramesh";
	
	public void showDetails()
	{
		System.out.println("Name is "+name+" "+"\nid is "+id);
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
	
	
	
}
