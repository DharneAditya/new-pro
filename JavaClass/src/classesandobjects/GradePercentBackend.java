package classesandobjects;

public class GradePercentBackend {

	double percent (double total)
	{     
		double percent=0;
		
		percent=((total/500)*100);
				
	     return percent;
	}
	
	void grade (double percent)
	{
		if (percent >=80 && percent <=100)
		{
			System.out.println("Grade obtained is 'A' " +percent);
		}
		
		else if (percent >=70 && percent <=79)
		{
			System.out.println("Grade obtained is 'B' "+percent);
		}
		
		else if (percent>45 && percent <=69)
		{
			System.out.println("Grade obtained id 'C' "+percent);
		}
		else 
		{
			System.out.println("Grade octained is 'D' "+percent+"you are failed in exam");
		}
		
		
	}
	
	
	
	
}
