package inhertance;

public class IdEmployeeSalaryMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setAdress("Near bangladesh");
		e1.setContact("1234567890");
		e1.setIdNo(1234);
		e1.setDept("Maintainance");
		e1.setSalary(90000);
		
		System.out.println(e1.getAdress()+"\n"+e1.getContact()+"\n"+e1.getDept()+"\n"+e1.getIdNo()+"\n"+e1.getSalary());

	}

}
