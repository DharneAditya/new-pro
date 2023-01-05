package mock1;

public class RakshaMamClassMockQueAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first
		
		int arr[]= {1,2,3,4,5,6,7,8,5};
		
		int add=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==5)
			{
				add=add+5;
			}
			else if (arr[i]%2==0)
			{
				add=add+1;
			}
			else
			{
				add=add+3;
			}
		}
		
		System.out.println(add);
		
		// second
		
		int ar[]= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==10)
				{
				System.out.println("number are "+ar[i]+" "+ar[j]);	
				}
			}
		}
		
		//third
		
		String str[]= {"java","nnnnnnnnnnnnnnnnn","india","corennnnnnnnn","advance"};
		
		String longest="java";
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				
				
				if(str[i].length()>longest.length())
				{
					longest=str[i];
				}
				
				
			}
		}
		System.out.println(longest);
		
		
		
	}

}
