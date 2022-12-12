package abstraction;

public class BankProject implements Project{

	@Override
	public void requirement() {
		System.out.println("New bank in area");
		
	}

	@Override
	public void planning() {
		System.out.println("Where and how to build a new bank");
		
	}

	@Override
	public void design() {
		System.out.println("Achitectural design of a bank");
		
	}

	@Override
	public void development() {
        System.out.println("New features of a bank");		
	}

	@Override
	public void testing() {
		System.out.println("Testing of all the new features of a bank");
	}

	@Override
	public void deployment() {
		System.out.println("Deplying all the ideas stated above");
		
	}

	@Override
	public void maintainance() {
		System.out.println("Maintainance of bank yearly");
		
	}

	

}
