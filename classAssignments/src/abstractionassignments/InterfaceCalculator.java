package abstractionassignments;

public interface InterfaceCalculator {

	void add(int a,int b);
	void subtraction(int a, int b);
	void multiplication(int a,int b);
	void division(int a,int b);
}

class ScientificCalculator implements InterfaceCalculator
{

	
	public void add(int a, int b) {
		
		System.out.println("Addition of two number is "+(a+b));
	}

	
	public void subtraction(int a, int b) {
		System.out.println("Subtraction of two number is "+(a-b));
	}

	
	public void multiplication(int a, int b) {
		System.out.println("Multiplication of two number is "+(a*b));
		
	}

	
	public void division(int a, int b) {
		System.out.println("Division of two number is "+(a/b));
	}
	
   void power(int a ,int b,int power)
	{
		 
		 
		 for(int i=1;i<=b;i++)
		 {
			 power=a*i;
		 }
		 
		 
		System.out.println("Calculation of number to the power is  "+(power));
	}
	 
	 void sqrt(double a)
	 {
		
		 System.out.println("Square Root of of a number is "+(Math.sqrt(a)));
	 }
	 
     void square(int a)
	 {
	
		 System.out.println("square of a number "+(a*a));
	 }
	
	
	
}
