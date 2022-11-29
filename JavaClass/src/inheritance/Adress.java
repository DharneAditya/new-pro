package inheritance;

public class Adress {

	private String area,city,state;
	private int pincode;
	
	public String getArea()
	{
		return area;
	}
	
	public void setArea(String area)
	{
		this.area=area;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city=city;
	}
	
	public String getSate ()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state=state;
	}
	
	public int getPincode()
	{
		return pincode;
	}
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	
	public String toString()
	{
		return area+" "+city+" "+state+" "+pincode;
	}
	
}


