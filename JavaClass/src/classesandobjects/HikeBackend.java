package classesandobjects;
import java.util.Scanner;
public class HikeBackend {

	
	double hike(int a,char ab)
	{
		double newsalary = 0;	
		
		if (ab =='a')
		{
			double c = a*0.20;
		    newsalary=a+c;
			System.out.println("incremented Salary is " +newsalary);
		}
		else if(ab =='b')
		{
			double c= a*0.15;
	 	 newsalary=a+c;
			System.out.println("Incremented salary is  " +newsalary);
		}
		else if(ab =='c')
		{
		    double c= a*0.10;
		    newsalary=a+c;
		    System.out.println("Incremented salary is  " +newsalary);
		}
		else 
		{
			System.out.println("Low rating Can not increment");
		}
		return newsalary;
		
	}
	
	
	
        
	void Pf( double newsalary, double b)
	{
		double c= (newsalary*b)/100;
		double DeductedAmount=newsalary-c;
		System.out.println("So your salary after deduction PF of "+b+" % is "+DeductedAmount);
		
		
	}
	
	
	void bonus (double newsalary)
	{
		double ebouns =newsalary*0.25;
		double bonus =newsalary+ebouns;
		System.out.println("Bonus Calculated is "+bonus);
	}

}
