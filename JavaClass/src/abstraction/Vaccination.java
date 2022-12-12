package abstraction;

public class Vaccination implements Project{

	@Override
	public void requirement() {
		System.out.println("To imporive health");
		
	}

	@Override
	public void planning() {
		System.out.println("planning of a project");
		
	}

	@Override
	public void design() {
		System.out.println("Design of a vaccine");		
	}

	@Override
	public void development() {
        System.out.println("Project devlopment");		
	}

	@Override
	public void testing() {
		System.out.println("Ptroject testing ");
	}

	@Override
	public void deployment() {
		System.out.println("Deployment of a project");
		
	}

	@Override
	public void maintainance() {
		System.out.println("How to do project");
		
	}

}
