package abstraction;

public class Swift extends Car {

	void setdata(String engine , int price, int serialNo)
	{
		this.engine=engine;
		this.price=price;
		this.serialNo=serialNo;
	}
	
	void display ()
	{
		System.out.println(engine+" "+price);
	}
	
	void dashboard()
	{
		System.out.println("New dashboard");
		
	}

	
	void safetyfeatures() 
	{
		System.out.println("New safety features");
		
	}

	
	void builquality() 
	{System.out.println("God build Quality");
		
	}

}
