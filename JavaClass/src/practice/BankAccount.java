package practice;

import java.util.Scanner;

public class BankAccount {
	
	
 int acno,balance;
 String name;

void FillCustomersDetails(int a,int b,String n)
{
	acno=a;
	balance=b;
    name=n;
}

void ShowDetails()
{
	System.out.println(acno+" "+balance+" "+name);
}


public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	BankAccount a1=new BankAccount();
	System.out.println("Enter details accno");
	int a=sc.nextInt();
	System.out.println("Enter balance");
	int b=sc.nextInt();
	System.out.println("Enter name");
	String s=sc.next();
	a1.FillCustomersDetails(a,b,s);
	a1.ShowDetails();
			
	
	
	
	
	
}
}
