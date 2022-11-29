package practice;
import java.util.Scanner;
public class WhileTableOfANumber {

	public static void main(String[] args) {
		
		int a,b,count=0;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number for table");
		
		a=sc.nextInt();
		System.out.println("Enter range upto");
		b=sc.nextInt();
		
		while(count<=b)
		{
			System.out.println(a+"*"+count+"="+(a*count));
			count++;
		}
	

	}

}
