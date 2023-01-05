package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveAllOcurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String s=sc.next();
		
		System.out.println("Enter the charatcter to be remove");
		
		char ch=sc.next().charAt(0);
		String result ="";
		char str[]=s.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			if(ch!=str[i])
			{
				result =result+str[i];
			}
		}
		
		System.out.println(result);
	}

}
