package practice;

import java.util.Scanner;

public class PercentageAndClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter all the subject numbers");
		System.out.println("Enter marks scored in maths");
		int a=sc.nextInt();
		System.out.println("Enter marks scored in science");
		int b=sc.nextInt();
		System.out.println("Enter marks scored in english");
		int c =sc.nextInt();
		System.out.println("Enter marks scored in social science");
		int d =sc.nextInt();
		System.out.println("Enter marks scored in envirmental science");
		int e=sc.nextInt();
		
		int total=a+b+c+d+e;
		float percent = (total*100)/500;
		
		if (percent>80) {
			System.out.println("percentage are = "+percent+  "First calss");
	   }
		else if (percent>70) {
			System.out.println("percentage are = "+percent+  "Second calss");
		}
		else if(percent>60) {
			
			System.out.println("percentage are =" +percent+  "Third calss");
		}
		else if(percent>50) {
			System.out.println("percent are ="+percent+ "lower class");
		}
		else 
		{
			System.out.println("percent are = "+ percent+  "person is not qualified to continue");
		}
	}

}
