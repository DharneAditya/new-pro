package abstraction;

public abstract  class Car {

	int serialNo,price;
	String engine;
	
	void wheelno()
	{
		System.out.println("4 Wheels ate there in a car");
	}
	
	void headlights()
	{
		System.out.println("The are 2 headlights in a car");
		
	}
	
	abstract void dashboard();
	abstract void safetyfeatures();
	abstract void builquality();
	abstract void alloyWheel();
}
