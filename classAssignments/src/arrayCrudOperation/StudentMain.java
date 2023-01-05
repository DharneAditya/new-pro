package arrayCrudOperation;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		StudentCrud c= new StudentCrud();
		
		System.out.println("Choose the option ");
		
		
		char quit='n';
		
		
		while(quit!='y')
		{
			int s=sc.nextInt();
			
			switch(s)
			{
		case 1:
			c.insertData();
			
			break;
			
		case 2:
			c.showDetails();
			
			break;
			
		case 3:
			c.updateData();
			
			break;
			
		case 4:
			c.searchData();
			
			break;
			
			default:
				
				
			System.out.println("Invalid Input");
			
			}
		 System.out.println("Do you Want to quit press y/n ");
		 
		
		 
		 quit=sc.next().charAt(0);
		}
		
	}
	    
	    	
			
			
		
	    
		
		
		
			
		
		
		}
	
	

		
