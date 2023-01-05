package arrays;

import java.util.Arrays;

public class MeanCharInArray {

	public static void main(String[] args) {
		
		
		char arr[]= {'b','a','d','c','e','h','g','f'};
		
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
		System.out.println("The mean charactor is = "+arr[0]);
		

	}

}
