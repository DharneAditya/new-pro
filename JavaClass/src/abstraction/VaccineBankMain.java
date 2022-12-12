package abstraction;

public class VaccineBankMain {

	public static void main(String[] args) {
		
		Vaccination v1=new Vaccination();
		v1.requirement();
		v1.planning();
		v1.design();
		v1.development();
		v1.testing();
		v1.deployment();
		v1.maintainance();
		
System.out.println();
System.out.println();
		
		
		BankProject b1=new BankProject();
		
		b1.requirement();
		b1.planning();
		b1.design();
		b1.development();
		b1.testing();
		b1.deployment();
		b1.maintainance();
		
	}

}
