package practice;
import java.util.Scanner;

public class ForLoopTablePractice {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number for table");
		int a=sc.nextInt();
		System.out.println("Enter the range upto");
		int r=sc.nextInt();
		
		for(int count=0;count<=r;count++)
		{
			System.out.println(a+"*"+count+"="+(a*count));
		}
        
		
		int count=0;
		
		while(count <r)
		{
			int p=a*count;
			 count ++;
			System.out.println("Table is "+p);
		}
		
		
		
		
		
		

	}

}
