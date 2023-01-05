package Strings;

import java.util.Arrays;

public class ReverseOfWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ab="this is Java Class";
		
		String str[]=ab.split(" ");
		
		System.out.println(Arrays.toString(str));
		
		int mid=str.length/2;
		
		for(int i=0;i<mid;i++)
		{
			String temp=str[i];
			
			str[i]=str[str.length-i-1];
			
			str[str.length-i-1]=temp;
		}
		
		System.out.println(Arrays.toString(str));
	}

}
