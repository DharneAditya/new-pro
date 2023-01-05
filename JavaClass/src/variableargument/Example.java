package variableargument;

public class Example {

	
	public void sum (String s,int sum,int...a)
	{
		System.out.println("Put method name");
		
		 
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of total array is = "+sum);
		System.out.println("Percentage is = "+(sum/a.length));
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Example e=new Example();
	    e.sum("Addition", 0,45,90,35);
	}

}
