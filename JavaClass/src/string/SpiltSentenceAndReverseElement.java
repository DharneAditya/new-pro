package string;

import java.util.Arrays;

public class SpiltSentenceAndReverseElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String str="Java is a programming language";
		  
		  String strg[]=str.split(" ");
		  
		  System.out.print(Arrays.toString(strg));
		  
		  for(int i=0;i<strg.length;i++)
		  
		  { char ch[]=strg[i].toCharArray();
		  
		  System.out.println(strg[i]);
		  
		  System.out.println(Arrays.toString(ch));
		  
		  for(int j=ch.length-1;j>=0;j--) 
			  
		  { System.out.print(ch[j]); }
		  
		  System.out.println();
		  
		  }
		 
		
		
		String num="asdjb5asfjnasf7sjdvn8";
		
		char a[]=num.toCharArray();
		System.out.println(Arrays.toString(a));
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>'0' && a[i]<'9')
			{
				sum=sum+(a[i]-48);
				
			}
		}
		System.out.println(sum);
		
		
		
	}

}
