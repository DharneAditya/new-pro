package array;

public class ArrayLiterals {

	void arrayLenght(int a[])
	{
		System.out.println("\nLenghth of array is "+a.length);
	}
	
	void arrayElements(int a[])
	{
		System.out.println("Array elements are");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	void searchElements (int a[],int element)
	{
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("Element is present at index  "+i);
			}
			else 
				count++;
		}
		
		if (count==a.length)
			System.out.println("element not present");
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		ArrayLiterals a1=new ArrayLiterals();
		a1.arrayElements(arr);
		a1.arrayLenght(arr);
		a1.searchElements(arr, 70);
		
		
		
		
	}

}
