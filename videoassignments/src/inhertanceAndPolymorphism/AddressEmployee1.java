package inhertanceAndPolymorphism;

public class AddressEmployee1 {

	public static void main(String[] args) {
		
		Address1 a1=new Address1();
		a1.setCity("Pune");
		a1.setPin(1212);
		a1.setSocity("Nirmal");
		a1.setSrNo(121212);
		
		Employee1 e1=new Employee1 ();
		e1.setA(a1);
		e1.setId(121);
		e1.setName("Ramesh");
		e1.setSalary(40000);
		
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary()+" "+e1.getA());

	}

}
