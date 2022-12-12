package array;

public class ArrayLiteralsAlternate {

	void arrayLength(int a[])
	{
		System.out.println("Lenght of array is "+a.length);
	}
	
	void arrayElements(int a[])
	{
		System.out.println("Array elements are");
		
		for (int i=0;i<a.length;i+=2)
		{
			System.out.print(a[i]+" ");
		}
	}
}
