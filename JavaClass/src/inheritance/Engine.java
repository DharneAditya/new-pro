package inheritance;

public class Engine {

	int power,torque;
	String name,companyName;
	
	Engine(int power,int torque,String name,String companyName )
	{
		this.power=power;
		this.torque=torque;
		this.name=name;
		this.companyName=companyName;
	}
	
	
	public String toString()

	{
		return power+" "+torque+" "+name+" "+companyName;
	}
}
