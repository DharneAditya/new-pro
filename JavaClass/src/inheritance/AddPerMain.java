package inheritance;

public class AddPerMain {

	public static void main(String[] args) {
		
		Adress a1=new Adress();
		a1.setArea("balaji");
		a1.setCity("Chandrapur");
		a1.setPincode(4421);
		a1.setState("maharashtra");
		
		Person p1=new Person();
		p1.setAge(12);
		p1.setContact("12313");
		p1.setName("rohan");
		p1.setId(123);
		p1.setA(a1);
		
		System.out.println(p1.getAge()+" "+p1.getContact()+" "+p1.getName()+" "+p1.getId()+"\n"+p1.getA());

	}

}
