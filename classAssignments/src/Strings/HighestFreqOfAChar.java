package Strings;
import java.util.Scanner;
public class HighestFreqOfAChar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the input String");
		String str=sc.next();
		
		System.out.println("Enter char for frequency measurement");
		char ch=sc.next().charAt(0);
		
		int freq=0;
		
		for(int i=0;i<str.length();i++)
		{
		   if(ch==str.charAt(i))
		   {
			   freq=freq+1;
		   }
		}
		
		System.out.println("Frequency of a char in a given Strig is  ="+freq);
		
		
		
		

	}

}
