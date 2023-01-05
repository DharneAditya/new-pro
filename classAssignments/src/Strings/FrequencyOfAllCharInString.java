package Strings;
import java.util.Scanner;
public class FrequencyOfAllCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String input");
		String str=sc.nextLine();
		
		for(char ch='a';ch<'z';ch++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(ch==str.charAt(j))
				{
					count++;
				}
				
				
			}
			if(count!=0)
			{
				System.out.println(ch+" ="+count);
			}
			
		}
	}

}
