package Strings;
import java.util.Scanner;
public class LastOccuranceOfAChar {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the input String");
		
		String sb=sc.next();
		
		System.out.println("Enter character to be found");
		
		char ch=sc.next().charAt(0);
		
		int lc=0;
		
		for(int i=0;i<sb.length();i++)
		{
			if(ch==sb.charAt(i))
			{
				lc=i;
			}
		}
		
		System.out.println(sb.charAt(lc)+" At index "+lc);

	}

}
