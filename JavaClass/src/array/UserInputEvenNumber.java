package array;
import java.util.Scanner;
public class UserInputEvenNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of An Array");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter elements of Array");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements of array are");
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
