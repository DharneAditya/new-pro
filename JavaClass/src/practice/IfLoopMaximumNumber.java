package practice;
import java.util.Scanner;
public class IfLoopMaximumNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("print Maximun Number is "+a);
			
		}
		else if (b>a && b>c)
		{
			System.out.println("maximum number is "+b);
			
		}
		else
			System.out.println("maximum number is "+c);

		
	}

}
