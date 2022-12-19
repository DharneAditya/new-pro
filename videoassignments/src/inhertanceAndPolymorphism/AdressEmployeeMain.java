package inhertanceAndPolymorphism;

public class AdressEmployeeMain {

	public static void main(String[] args) {
		
		Address a=new Address(12,442401,"Nirmal","pune");
		Employee e=new Employee(121,50000,"Ramesh",a);
		System.out.println(e.toString());
		

	}

}
