package inhertanceAndPolymorphism;

public class Address {

	int srNo,pin;
	String socity,city;
	
	
	Address(int srNo,int pin,String socity,String city)
	{
		this.srNo=srNo;
		this.city=city;
		this.pin=pin;
		this.socity=socity;
		
	}
	
	public String toString()
	{
		return srNo+" "+city+" "+pin+" "+socity;
	}
	
}
