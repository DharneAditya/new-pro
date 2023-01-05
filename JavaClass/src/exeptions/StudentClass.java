package exeptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentClass {

	Scanner sc=new Scanner(System.in);
	int marks[];
	int sum=0;
	public void averageOfStudent() 
	{
		try
		{
			
		System.out.println("Enter total number of subject");
		int size=sc.nextInt();
	    marks=new int [size];

		System.out.println("Enter Student name");
		String name=sc.next();
	    for(int i=0;i<marks.length;i++)
	    {
	  
			System.out.println("sub marks"+i);
		   marks[i]=sc.nextInt();
		   sum=sum+marks[i];
	    }
	    
	    
	    int a=(sum/marks.length);
	    System.out.println("Average of all marks is "+a);
		
		}
		catch(ArithmeticException|InputMismatchException x)
		{
			System.out.println("Typre of error is "+x.getMessage());
			
			System.out.println("Typre of class is "+x.getClass());
			
		}
		
	}
	
	
	
}
