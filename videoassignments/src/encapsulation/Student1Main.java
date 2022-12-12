package encapsulation;

public class Student1Main {

	public static void main(String[] args) {
		
		Student1 s1=new Student1 ();
		s1.showDetails();
		s1.setId(4321);
		s1.setName("Nilesh");
		
		System.out.println("New name is "+s1.getName()+"\nNew id is "+s1.getId());
	}

}
