package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfCharIndexOfWordsInASentence {

	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
	char ch[]= new char[27];
	char ab='a';
	
	
	for(int i =0;i<ch.length;i++)
	{
		if (i==0)
		{
			ch[i]='0';
		}
		else
		{
		ch[i]=ab;
		ab++;
		}
	}
	
	
		//System.out.println(Arrays.toString(ch));
		
		 System.out.println("Enter you sentence to be decode");
		 
		String str=sc.nextLine();
		str=str.toLowerCase();
		String strg[]=str.split(" ");
		System.out.print(Arrays.toString(strg));
	
		
		for(int i=0;i<strg.length;i++)
		{
			int sum = 0;
			char a[]=strg[i].toCharArray();
			
			
			
			                                
			for(int j=0;j<ch.length;j++)
			{
		     for(int k=0;k<a.length;k++)
		     {
		    	 
		           
			if(ch[j]==a[k])
			{
				sum=sum+j; //sum=33
			}
		
			
		    }
			}
			System.out.print("\n"+strg[i]+"="+sum);
		}
		
		
		
		
		
		
		}

}
