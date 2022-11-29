package classesandobjects;
import java.util.Scanner;
public class DigitofANumberFrontEnd {
	
	public static void main (String[]args)
	{
		DigitOfANumber c1=new DigitOfANumber();
		Scanner sc=new Scanner (System.in);
		System.out.println("choose the program 1-Product,2-Addition,3-frequency");
		int a=sc.nextInt();
		
		switch (a)
		{
		case 1: c1.product();
		break;
		case 2: c1.addition();
		break;
		case 3: c1.frequency();
		break;
		default : System.out.println("Enter valid Option");
		}
		
		
		
		
		
		
		
		
		
	}

}
