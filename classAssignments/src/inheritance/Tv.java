package inheritance;

public class Tv extends Electronics
{

	
	String features,color;
	
	
	Tv(String features,String color)
	
	{
		super(4,4,4,4);
		
		this.color=color;
		this.features=features;
	}
	
	
	  public String toString() { return features+" "+color; }
	 
	
	
}
