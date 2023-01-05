package thisAndsuperKeyword;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Student s1=new Student ();
		s1.setId(121);
		s1.setName("Ramesh");
		
		Student s2=new Student ();
		s2.setId(122);
		s2.setName("Suresh");
		
		System.out.println("Student one imformation\n"+s1.getId()+"\n"+s1.getName());
		System.out.println("Student two imformation\n"+s2.getId()+"\n"+s2.getName());
	
	}

}
