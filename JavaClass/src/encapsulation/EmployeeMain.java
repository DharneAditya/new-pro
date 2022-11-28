package encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.setId(001);
		e1.setSalary(50000);
		e1.setName("Ramesh");
		e1.setDept("Reception");
		e1.setEmail("Rameshbaba@gmail.com");
        System.out.println(e1.getID()+" "+e1.getSalary()+" "+e1.getName()+" "+e1.getDept()+" "+e1.geteEmail());
	}

}
