package abstraction;

public class Telivison extends Electronics{

	void setdata(int price,int weight,String color)
	{
		this.price=price;
		this.weight=weight;
		this.color=color;
	}
	
	void display ()
	{
		System.out.println(price+"Rupess"+weight+"\n kgs "+color+"\ncolor");
	}
	
	void rating() 
	{
		System.out.println("Rating for this television is 5 star");
		
	}

	
	void electricityConsumption() 
	{
		System.out.println("This television consumes 5w of power");
		
	}

	
	void features() 
	{
		System.out.println("This television has voice command");
		
	}
	
	

	

}
