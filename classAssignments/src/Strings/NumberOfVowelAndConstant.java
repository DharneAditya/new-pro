package Strings;
import java.util.Scanner;
public class NumberOfVowelAndConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the word String  here");
		
		String str=sc.next();
		
		System.out.println("Enter String sentence");
		
		String b=sc.nextLine();
		
		String sentence=sc.nextLine();
		
		String s[]=sentence.split(" ");
		
		System.out.println(sentence.length());
		
		
		
		
		char vowel[]= {'a','e','i','u','o'};
		
		int vowelCount=0;
		int constant= 0;
		int sv=0;
                for(int i =0;i<str.length();i++)
                {
                	for(int j=0;j<vowel.length;j++)
                	{
                		
                	
                	if(str.charAt(i)==vowel[j])
                	{
                		vowelCount=vowelCount+1;
                		
                	}
                  	
                		
                	}
                      	
                	
                }
               constant=str.length()-vowelCount;
                
               for(int i=0;i<sentence.length();i++)
               {
            	  for(int j=0;j<vowel.length;j++)
            	  {
            		  if(sentence.charAt(i)==vowel[j])
                  	{
                  		sv=sv+1;
                  		
                  	}
            	  }
            
               }
              
                System.out.println("Total Number of vowel is =  "+vowelCount);
                System.out.println("Total Number of constant is =  "+constant);
                System.out.println("Total number of a vowel in a sentence is ="+sv);
                
                
	}

}
