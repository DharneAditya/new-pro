package thisAndsuperKeyword;

public class Cycle {

	int accountNO;
	int noOfWheels;
	
	Cycle()
	{
		this(5);

		System.out.println("I am a default constructor");
		
	}
	
	Cycle(int accountNo)
	{
		this(3,6);
		System.out.println("One more Constructor");
	}
	
	Cycle(int accountNo,int noOfWheels)
	{   
		
		System.out.println("I am a another constructor");
		
	}
	
	
	
}
