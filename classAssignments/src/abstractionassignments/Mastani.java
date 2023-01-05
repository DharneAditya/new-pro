package abstractionassignments;

public class Mastani  extends BlackForest  implements IceCream, Juice {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating icecream");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Drinking drink");
	}
	
	public void flavor()
	{
		super.flavor();
		
		System.out.println("Flavor was mastani");
	}

	
	
	
	
	
	
}
