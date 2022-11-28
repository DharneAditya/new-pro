package javaclass;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1");
		a=sc.nextInt();
		System.out.println("Enter number 2");
		b=sc.nextInt();
		c=a=b;
		
		if(c>0)
		{		
		System.out.println("hello world");
		}
		else
		{ 
			System.out.println("no world");
		}
	}

}
