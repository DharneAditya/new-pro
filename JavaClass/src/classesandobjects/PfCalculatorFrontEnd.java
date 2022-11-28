package classesandobjects;
import java.util.Scanner;
public class PfCalculatorFrontEnd {

	public static void main(String[] args) {
		
		PfCalculator c1=new PfCalculator ();
		Scanner sc=new Scanner (System.in);
		System.out.println("Put your Main Salary");
        int a=sc.nextInt();
        System.out.println("Put percentage to be deducted ");
        double b=sc.nextDouble();
        
        c1.Pf(a, b);
        sc.close();         
	}

}
