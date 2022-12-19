package inhertanceAndPolymorphism;
import java.util.Scanner;
public class AddEmpMain {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner (System.in);
		
		Employee2 e1=new Employee2 ();
		
		System.out.println("Enter Employee details");
		System.out.println();
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		System.out.println("Enter employee name");
		String name=sc.next();
		System.out.println("Enter employee salary");
		int salary=sc.nextInt();
		System.out.println();
		System.out.println("Enter address details");
        System.out.println();
		Address2 a=new Address2();
		System.out.println("Enter Street number");
		int srno=sc.nextInt();
		System.out.println("Enter pincode");
		int pin=sc.nextInt();
		System.out.println("Enter socity name");
		String socity=sc.next();
		System.out.println("Enter city name");
		String city=sc.next();
		
		
		a.addressDetails(srno, pin, socity, city);
		e1.getEmployeeDetails(id, salary, name, a);
		e1.showEmployeeDetails();
		
		
		
	}

}
