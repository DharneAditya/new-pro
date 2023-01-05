package Strings;
import java.util.Scanner;
import java.util.Arrays;

public class IntermediatePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="HELLO&WORLD";
		
		
		a.compareToIgnoreCase(a);
		char[] ch =a.toCharArray();
		
		String[] b=a.split("&");
		System.out.println(Arrays.toString(b));
		
		int count =0;
		for(int i=0;i<a.length();i++)
		{
			if(ch[2]==ch[i])
			{
				count++;
			}
		}
		
		// Remove Ocurance of first character
		
		System.out.println("Occurance of first char"+count);
		int c=0;
		char ab='O';
		for(int i=0;i<ch.length;i++)
		{
			if(ab==ch[i])
			{
				c++;
			}
		}
		System.out.println(c);
		
		//Trim Leading Spaces of a String.
		
		String k="  Aditya";
	String q=k.trim();
		System.out.println(k);
		System.out.println(q);
	}

}
