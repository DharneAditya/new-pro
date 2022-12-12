package array;

public class PrimeNumber {

	void arrayElements(int a[])
	{
		for (int i =0;i<a.length;i++)
		{
			System.out.println("Array elements with index are  "+a[i]+ " ");
		}
	}
	void addition(int a[])
	{
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a.length;
		}
		
		System.out.println("Sum of all the elemant of array is  "+sum);
		
	}
	
	void primeNumber(int a[])
	{
		int c;
		
		for (int i=0;i<a.length;i++)
		{
			for (c=2;c<=a[i];c++)
			{
				if (a[i]%c==0)
				{
					break;
				}
			}
			if(a[i]==c)
			{
				System.out.println("The prime number are  "+a[i]);
			}
		}
	}
	
	void ArrayInReverse(int a[])
	{
		for (int i=a.length-1;i>0;i--)
		{
			System.out.print(" "+a[i]);
		
		}
		System.out.println();
	}
	

	void ReplacingNegative(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<=0)
			{
				a[i]=0;
			}
			System.out.print( a[i]+" ");
		}
	}
	
	void AverageOfmarks(int a[])
	{
       int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a.length;
		}
		
		System.out.println("Average of all the elemant of array is  "+(sum/a.length));	
	}
	
}
