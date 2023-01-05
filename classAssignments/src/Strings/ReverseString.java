package Strings;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="string";
		char ch[]=s.toCharArray();
		
		System.out.println(Arrays.toString(ch));
	
		int mid =ch.length/2;
		
		for(int i=0;i<mid;i++)
		{
			char temp=ch[i];
			
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
			
			
		}
		
		System.out.println(Arrays.toString(ch));
	}

}
