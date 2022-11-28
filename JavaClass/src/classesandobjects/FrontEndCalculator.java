package classesandobjects;
import java.util.Scanner;
public class FrontEndCalculator {

	public static void main(String[] args) {
		
	Calculator c1=new Calculator();
	Scanner sc= new Scanner (System.in);
	System.out.println("Select Option 1-Addition,2-Subtraction,3-Division,4-Multiplication,5-Square root");
	int b=sc.nextInt();
	
	switch(b)
	{
	case 1: c1.adiition();
	break;
	case 2: c1.subtraction();
	break;
	case 3: c1.division();
	break;
	case 4: c1.multiplication();
	break;
	case 5: c1.squareroot();
	default : System.out.println("Enter valid Option");
	}
	
	sc.close();
	}
}
