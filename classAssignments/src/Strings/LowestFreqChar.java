package Strings;
import java.util.Scanner;
public class LowestFreqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the inlut String ");
		String input=sc.next();
		
		int arr[]=new int [127];
		
		for(int i=0;i<input.length();i++)
		{
			arr[input.charAt(i)]=arr[input.charAt(i)]+1;
		}
		
		int min=2;
		
		char ab=' ';
		
		for(int i=0;i<input.length();i++)
		{
			if(min>arr[input.charAt(i)])
			{
				ab=input.charAt(i);
				min=arr[input.charAt(i)];
			}
		}
		
		System.out.println("Minimum frequency of a character "+ab+" is = "+min);
		
		
	}

}
