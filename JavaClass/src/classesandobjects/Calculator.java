package classesandobjects;
import java.util.Scanner;
public class Calculator {
	
	
	void adiition()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number 1" );
		int a=sc.nextInt();
		System.out.println("Enter Number 2");
		int b=sc.nextInt();
		System.out.println("Addition of Both number is "+(a+b));
		sc.close();
	}
	
	void subtraction()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number 1" );
		int a=sc.nextInt();
		System.out.println("Enter Number 2");
		int b=sc.nextInt();
		System.out.println("Subtraction of Both number is "+(a-b));
		sc.close();
	}
	
	void division()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number 1" );
		int a=sc.nextInt();
		System.out.println("Enter Number 2");
		int b=sc.nextInt();
		System.out.println("Division of Both number is "+(a/b));
		sc.close();
	}
	
	void multiplication()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number 1" );
		int a=sc.nextInt();
		System.out.println("Enter Number 2");
		int b=sc.nextInt();
		System.out.println("Multiplication of Both number is "+(a*b));
		sc.close();
	}
	void squareroot()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter  number" );
		int a=sc.nextInt();
		
		System.out.println("Square Root of Both number is "+(a*a));
		sc.close();
	}
}

	