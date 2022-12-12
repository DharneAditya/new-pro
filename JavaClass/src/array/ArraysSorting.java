package array;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {
		
		int a[]= {10,30,50,60,70,20,40,80};
		
		System.out.println(Arrays.toString(a));

		
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{		
					
				
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

		
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{		
					
				
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		char b[]= {'b','c','a','d','f','e','g','h'};
		
		for (int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				if(b[j]>b[j+1])
				{		
					
				
				char temp= b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
