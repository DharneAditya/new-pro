package forloop;

import java.util.Scanner;

public class SameAlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("mention how many row ");
		char h=sc.next().charAt(0);

		for (char c='a';c<=h;c++)
		{
			for ( char i='a';i<=c;i++)
			{
				System.out.print(c+"");
			}
			System.out.println();
			
		}
		sc.close();
	}

}
