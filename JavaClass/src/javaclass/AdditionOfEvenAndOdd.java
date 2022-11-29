package javaclass;
import java.util.Scanner;
public class AdditionOfEvenAndOdd {

	public static void main(String[] args) {
		
		int num,r,e=0,o=0;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		
		while(num!=0) {
			r=num%10;
			
			if(r%2==0) {
				e=e+r;
			}
			else {
				o=o+r;
			}
			num=num/10;
		}
        System.out.println("Sum of Even Num"+e);
        System.out.println("Sum Of Odd Num"+o);
	}

}
