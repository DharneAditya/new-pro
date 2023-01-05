package Strings;
import java.util.Scanner;
public class HighestFreqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	   Scanner sc=new Scanner(System.in);
		
	   System.out.println("Enter the input String ");
	   
	   String str=sc.next();
	   
	   int arr[]=new int[127];
	   
	   //making array of all character refer askii value chart for this 
	   
	   for(int i=0;i<str.length();i++)
	   {
		   arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		   //arr[a]=arr[97]  = arr[97]=0;0+1;
	   }
	   
	   int max=-1;
	   
	   char c=' ';
	   
	   for(int i=0;i<str.length();i++)
	   {
		   if(max<arr[str.charAt(i)])
		   {
			   max=arr[str.charAt(i)];
			   
			   c=str.charAt(i);
		   }
	   }
	   
	   System.out.println("max frequency of character "+c+" is = "+max);
	   
	   int min=max;
	   char a=' ';
	  for(int i=0;i<str.length();i++)
	  {
		  if(arr[str.charAt(i)]<min)
		  {
			 min=arr[str.charAt(i)]; 
			 a=str.charAt(i);
		  }
		  
	  }
	  
	  
	   System.out.println("min frequency of character "+a+" is = "+min);
        
		
		
		
	}

}
