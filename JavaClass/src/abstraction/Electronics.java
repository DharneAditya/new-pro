package abstraction;

public abstract class Electronics {
	
	int price,weight;
	String color;
	
	
	void processor()
	{
		System.out.println("Every electronics item contains processor ");
	}
	
	void semiConductor()
	{
		System.out.println("Every Electrnics have semi conductors");
	}
	
	abstract void rating();
	abstract void electricityConsumption();
	abstract void features();
	
	
	

}
