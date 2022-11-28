package polymorphism;

public class Example1 {

	void add(int a,int b)
	{
		System.out.println("Addition of both variable is = "+(a+b));
	}
	
	void add(int a,String b)
	{
		System.out.println("Addition of both cariable is = "+(a+b));
	}
	
	void add(String a, String b)
	{		
			System.out.println("Addition of both cariable is = "+(a+b));		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Example1 e1=new Example1();
		e1.add(45,"add");
		
      
	}

}
