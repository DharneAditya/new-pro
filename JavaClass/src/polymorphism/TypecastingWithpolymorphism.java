package polymorphism;
import java.util.Scanner;
public class TypecastingWithpolymorphism {

	
	void convert(double a)
	{
		
		System.out.println("Conversion of double to int is = "+((int)a));
	}
	void convert (float f)
	{
		
		System.out.println("Conversion of float to double is = "+((float)f));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		TypecastingWithpolymorphism c1=new TypecastingWithpolymorphism();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double a=sc.nextDouble();
		System.out.println("Enter number");
		float f=sc.nextFloat();
		c1.convert(a);
		c1.convert(f);
	}

}
