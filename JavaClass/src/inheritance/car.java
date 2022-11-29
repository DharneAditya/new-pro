package inheritance;

public class car {

	int id,price;
	String name,maker;
	Engine e;
	Headlights h;
	
	car(int id,int price,String name, String maker,Engine e,Headlights h)
	{
		this.id=id;
		this.price=price;
		this.name=name;
		this.maker=maker;
		this.e=e;
		this.h=h;
	}
	
	public String toString()
	{
		return id+" "+price+" "+name+" "+maker+"\n"+e+" \n"+h;
	}
	
	
}
