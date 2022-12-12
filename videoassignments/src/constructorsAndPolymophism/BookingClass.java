package constructorsAndPolymophism;

public class BookingClass {

	public void bokTicket(Train t)
	{
		t.useMedim();
	}
	

	public void bokTicket(Bus b)
	{
		b.useMedim();
	}
	

	public void bokTicket(Plane p)
	{
		p.useMedim();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		BookingClass b1=new BookingClass();
		b1.bokTicket(new Plane());
		
	}

}
