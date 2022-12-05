package TEsting;
import java.util.Scanner;
public class TEsting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter 1");
		int num=sc.nextInt();
		
		int add=0;
		
		for (int i=1;i<=num;i++)
		{
			add=add+i;
		}
		
		System.out.println("add is"+add);
		
		System.out.println("Enter 2");
		
		int fact=sc.nextInt();
		int factorial =1;
		
		for(int i=1;i<=fact;i++)
		{
			factorial=factorial*i;
		}
			System.out.println(factorial);
		}
	
				

	}




     

            




