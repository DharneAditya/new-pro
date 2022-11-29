package practice;
import java.util.Scanner;
public class WhileLoopPrec {

	public static void main(String[] args) {
	
		int a=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number Range");
		int b=sc.nextInt();
		
		while(a<=b)
			
		{
			if (a%2==0) {
			System.out.println("a ="+a);
			}
			a++;
		}

	}

}
