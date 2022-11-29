package constructors;

public class EmployeeStaticFrontend {

	public static void main(String[] args) {
		System.out.println(EmployeeStaticBackend.Companyname);
		EmployeeStaticBackend e1= new EmployeeStaticBackend(12,400,"riya","mech");
		EmployeeStaticBackend e2= new EmployeeStaticBackend(13,400,"liya","tech");
		EmployeeStaticBackend e3= new EmployeeStaticBackend(14,400,"miya","lech");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
