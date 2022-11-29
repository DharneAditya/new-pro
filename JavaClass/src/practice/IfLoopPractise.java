package practice;

import java.util.Scanner;

public class IfLoopPractise {

	public static void main(String[] args) {
		
		
		int a;
		char ch;
		System.out.println("Enter your name");
		
		Scanner sc=new Scanner (System.in);
		ch=sc.next().charAt(0);
		System.out.println("Enter your Age");
		a=sc.nextInt();
		
		if(a>=18)
		{
			System.out.println("You are eligible to open account");
		}
		else {
			System.out.println("You Are below expected age");
		}
		
		
	
		
	}

}
