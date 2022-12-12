package accessmodifier;


public class Test1 {

	int a=100;
	public String city ="Pune";
	protected String state="Maharashtra";
	private int b=100;
	
	

	public static void main (String []args)
	{
		
		Test1 t1 =new Test1();
		System.out.println(t1.a);
		System.out.println(t1.city);
		System.out.println(t1.state);
		
		System.out.println(t1.b);
	}
}