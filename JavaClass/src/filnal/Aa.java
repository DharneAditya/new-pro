package filnal;

class Aa {

	 int a=100;
	 String name="Ramesh";
	
	void display()
	{
		System.out.println("In display method " +a);
	}
	
	
	
}


 class Bb extends Aa
{
	
	
	void display1 ()
	{
		name="Suresh";
		
		
		System.out.println("In Second Display method "+a);
	}
	
	
	
	
}
 
 class Cc
 
 
 {
 public static void main(String []args) {
	
	 Bb a1=new Bb();
	 
	 a1.display1();
	
	 
 }	 
	 
 }
 
 
