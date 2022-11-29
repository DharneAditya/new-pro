package practice;

import java.util.Scanner;

public class PractiseOne {

	public static void main(String[] args) {
		int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter Second number");
        b=sc.nextInt();
        c=a+b;
        
        if(c>=40)
        {
        	System.out.println("hehe papu pass");
        }
        else
        {
        	System.out.println("Sorry pappu failed the exam");
        }
	}

}
