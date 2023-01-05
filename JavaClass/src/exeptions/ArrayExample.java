package exeptions;
import java.util.Scanner;
public class ArrayExample {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int ar[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Enter the index number to print particular array");
		int u=sc.nextInt();
		
		
		try
		{
		System.out.println(ar[u]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		 System.out.println("Array index is out of bound "+ar.length);
		}
		
	}

}
