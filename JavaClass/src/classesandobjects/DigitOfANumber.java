package classesandobjects;
import java.util.Scanner;
public class DigitOfANumber {
	
	void product()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number To Evaluate");
		int num=sc.nextInt();
		int r,p=1;
		while(num!=0)
		{
			r=num%10;
			p=p*r;
			num=num/10;
		}
		System.out.println("Answer is "+p);
	}
	
	void addition()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number To Evaluate");
		int num=sc.nextInt();
		int r,p=0;
		while(num!=0)
		{
			r=num%10;
			p=p+r;
			num=num/10;
		}
		System.out.println("Answer is "+p);
	}
	
	void frequency()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number To Evaluate");
		int num=sc.nextInt();
		
		for(int i=0;i<=9;i++)
		{
			int temp=num,count=0;
			
			while(temp!=
					0)
			{
				int r=temp%10;
				if(r==i)
				{
					count++;
				}
				temp=temp/10;
			}
			if(count>0)
			{
				System.out.println(i+"--"+count);
			}
		}
		
	}

}
