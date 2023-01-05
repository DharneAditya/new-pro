package exeptions;

public class Example {
	
	public void add(int a,int b)
	{
		System.out.println("Addition is "+(a+b));
	}
	
	public void substraction(int a,int b)
	{
		System.out.println("Substraction is "+(a-b));
	}
	
	public void multiplication(int a,int b)
	{
		System.out.println("Multiplication is "+(a*b));
	}
	
	public void division(int a,int b)
	{
		System.out.println("Division is "+(a/b));
	}
	
	public static void main(String[] args) {
	
		int a=4,b=0;
		
		Example e1=new Example();
		
		e1.add(a, b);
		e1.substraction(a, b);
		try
		{
			e1.multiplication(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		e1.division(a, b);
				

	}

}
