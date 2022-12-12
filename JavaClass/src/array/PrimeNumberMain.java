package array;
import java.util.Scanner;
public class PrimeNumberMain {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter size of an Array");
		
		int size =sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter elements of an array");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		PrimeNumber p1=new PrimeNumber();
		p1.addition(arr);
		p1.arrayElements(arr);
		p1.primeNumber(arr);
		p1.ArrayInReverse(arr);
		p1.ReplacingNegative(arr);
		p1.AverageOfmarks(arr);

	}

}
