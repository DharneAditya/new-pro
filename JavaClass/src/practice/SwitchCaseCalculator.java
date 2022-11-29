package practice;
import java.util.Scanner;
public class SwitchCaseCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("choose options 1-addition, 2-subtraction, 3-multiplication, 4-division ");
        int o =sc.nextInt();
        System.out.println("Enter two numbers ");
        int a =sc.nextInt();
        int b=sc.nextInt();
       
       
       switch(o)
       {
       case 1:
    	   System.out.println("adition of two number is = "+(a+b));
    	   break;
       case 2:
    	   System.out.println("Subtraction of two number is = "+(a-b));
    	   break;
       case 3:
    	   System.out.println("multiplication of two number is ="+(a*b));
    	   break;
       case 4:
    	   System.out.println("division of two number is ="+(a/b));
    	   break;
    	   default: System.out.println("Enter valid inputs");
       }
	}

}
