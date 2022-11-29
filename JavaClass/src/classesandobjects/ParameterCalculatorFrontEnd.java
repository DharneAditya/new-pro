package classesandobjects;
import java.util.Scanner;
public class ParameterCalculatorFrontEnd {

	public static void main(String[] args) {
		
		ParameterCalulator c1 = new ParameterCalulator();
       Scanner sc=new Scanner (System.in);
       System.out.println("choise 1 2");
       
       int a=sc.nextInt();
       int b=sc.nextInt();
       
       int c=sc.nextInt();
       
       switch(c)
       {
       
       case 1: c1.addition(a, b);
       break;
       case 2: c1.subtraction(a, b);
       
       }
       
	}

}
