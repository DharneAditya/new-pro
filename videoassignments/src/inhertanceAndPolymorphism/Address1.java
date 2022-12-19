package inhertanceAndPolymorphism;

public class Address1 {

	
	int srNo,pin;
	String socity,city;
	
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getSocity() {
		return socity;
	}
	public void setSocity(String socity) {
		this.socity = socity;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString()
	{
		return srNo+" "+pin+" "+socity+" "+city;
	}
}
