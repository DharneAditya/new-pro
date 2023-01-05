package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class FirstCharCapitalOfEvryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Enter String input");
		
		String s=sc.nextLine();
		
		String str[]=s.split(" ");
		
		System.out.println(Arrays.toString(str));
		
		for(int i=0;i<str.length;i++)
		{
			char a=str[i].charAt(0);
			
			String ab=String.valueOf(a).toUpperCase();
			
			String subString=str[i].substring(1);
			
			str[i]=ab+subString;
		   
		
			
		}
		
		System.out.println(Arrays.toString(str));
		

	}

}
