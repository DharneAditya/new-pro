package inhertanceAndPolymorphism;

public class Address2 {

	int srno,pin;
	String socity,city;
	
	
	
	public void addressDetails(int srno,int pin,String socity,String city)
	{
		this.city=city;
		this.pin=pin;
		this.socity=socity;
		this.srno=srno;
	}
	
	public String toString()
	{
		return srno+" "+pin+" "+socity+" "+city;
	}
	
	public void showAddressDetails()
	{
		System.out.println(srno+" "+pin+" "+socity+" "+city);
	}
	
	
}
