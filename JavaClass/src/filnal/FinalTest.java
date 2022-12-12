package filnal;

public  class FinalTest 
{

	final int a=100;
	static String name="Ramesh";
	
	void display()
	{
		System.out.println("In display method " +a);
	}
}


 class B extends FinalTest
{
	
	
	void display1 ()
	{
		name="Suresh";
		System.out.println("In Second Display method "+a);
	}
	
	
	
	
}
 
 class C
 {
 public static void main(String []args) {
	
	 B a1=new B();
	 
	 a1.display1();
	 
	 
 }	 
	 
 }
 
 