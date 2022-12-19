package arraysRakshaMamAssignment;
import java.util.Arrays;
import java.util.Scanner;
public class OneDimensionalSimpleArray {

	public static int average(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		
		int average=sum/array.length;
		
		return average;
			
		
		
		
	}
	public static double average(double[] array1)
	{
		double sum=0;
		
		for(int i=0;i<array1.length;i++)
		{
			sum=sum+array1[i];
		}
		
		System.out.println(sum);
		
		double average=sum/array1.length;
		
		return average;
			
		
	}
	
	
	
	public static void main(String[] args) {
		
		//Program for one dimensional array to print array.
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {1,2,3,4,5,6};
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		// Program to calculate average value of a java array element..
		
		float sum=0f;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		float average=(sum/arr.length);
		
		System.out.println("Average of element is "+average);
		
        // Program to check if a array contains specific value..
		
		int a=4;
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==a)
			{
				System.out.println("The array contain "+arr[i]+" ont the index "+i);
			}
		}
		
		System.out.println();
		
		//Program to find index of an array
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("index of array element "+arr[i]+" is "+i);
		}
		
		System.out.println();
	    
		//Intermediate Programs
		
		//Copy array by iterating an Array
		
		
		int na[]= {1,2,3,4,5,6,7,8,9,10};
		int an[]=new int [10];
		
		for(int i=0;i<na.length;i++)
		{
			an[i]=na[i];
			
		}
		System.out.println("New array is "+Arrays.toString(an));
		
		System.out.println();
		
		//Program to print Reverse of an array..
		
		System.out.println("Length of an Array is "+na.length);
		
		
		System.out.println("\nArray without reverse is "+Arrays.toString(na));
		System.out.println();
		
		int n =na.length;

	    int mid=na.length/2;
	    
		for(int i=0;i<mid;i++)
		{
			int temp=na[i];			
			na[i]=na[n-1-i];
			na[n-1-i]=temp;
		}
		
		System.out.println("Reverse Array is "+Arrays.toString(na));
		
		System.out.println();
		
		//Program to Write two methods that return the average of an array with
		//following headers..
		
		
		
		
		int[] array= {1,2,3,4,5,6};
		
		double[] array1={6.0,3.4,6.4,1.2,4.0};
		
		
		OneDimensionalSimpleArray obj=new OneDimensionalSimpleArray();
		
		System.out.println("obj 1 average "+obj.average(array));
		
		System.out.println("obj 2 average "+obj.average(array1));
		
		System.out.println();
		
		//Array of String Assignment
		//WAJP2 add elements to a string array
	    //WAJP2 print elements of array.
		
		
		String ar[]=new String[10];
		
		System.out.println("Input elemnts for srting array");

		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter element on index no "+i);
			
		    String s=sc.next();
		    
		    ar[i]=s;
		  
		}
		System.out.println("The String arrys is "+Arrays.toString(ar));
		
		System.out.println();
		
		//Program to delete element of an Array from a specific index...
		
		for(int i=0;i<ar.length;i++)
		{
		if(ar[i]==ar[0])
		{
			ar[i]="zero";
		}
		}
		System.out.println("Deleted element of an Array ar from index 0 is replaced with zero the follwing array will be "+"\n"+Arrays.toString(ar));
		
		
		
		
		
		
		
		
		
		
		
	}

}
