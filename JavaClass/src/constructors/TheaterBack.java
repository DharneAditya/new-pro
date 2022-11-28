package constructors;

public class TheaterBack {

	int id,rating;
	String name,address,contact;
	
	TheaterBack(int id,int rating,String name,String address,String contact)
	{
		this.id=id;
		this.rating=rating;
		this.name=name;
		this.address=address;
		this.contact=contact;
				
	}
	
	
	
	public String toString()
	{
		return id+" "+name+" "+rating+" "+address+" "+contact;
	}
	
	
}
