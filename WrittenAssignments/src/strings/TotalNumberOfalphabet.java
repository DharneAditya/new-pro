package strings;
import java.util.Scanner;
public class TotalNumberOfalphabet {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String input");
		String str=sc.nextLine();
		
	    int alphabets = 0;
	    int digits=0;
	    int special=0;
	    
	    char ch;
	    for(int i=0;i<str.length();i++)
	    {
	    	ch=str.charAt(i);
	    	
	    	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
	    	{
	    		alphabets++;
	    	}	
	    		else if(ch>='0'&& ch<='9')
	    		{
	    			digits++;
	    		}
	    		
	    		else
	    		{
	    			special++;
	    		}
	    	
	    }
	    
	    System.out.println("/nTotal Number of Alphabets in a string is "+alphabets);
	    System.out.println("/nTotal Number of digits in a string is "+digits);
	    System.out.println("/nTotal Number of Speceal cahracters  in a string is "+special);
		
		
		
	}

}
