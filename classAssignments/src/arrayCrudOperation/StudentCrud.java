package arrayCrudOperation;
import java.util.Arrays;
import java.util.Scanner;
public class StudentCrud {

	
	Scanner sc=new Scanner(System.in);
	
	Student stud[]=new Student [2];
	
	
	public void insertData()
	{
		for(int i=0;i<stud.length;i++)
		{
		System.out.println("Insert Student "+i+" data ");
		
		System.out.println("\nEnter Student Id ");
		int id=sc.nextInt();
		System.out.println("Enter Student name \n");
		String name=sc.next();
		System.out.println("Enter Student email \n");
		String email=sc.next();
		System.out.println("Enter Student Contact \n");
		String contact=sc.next();
		System.out.println("Enter Student marks \n");
		int marks=sc.nextInt();
		System.out.println("Enter Student Dept \n");
		String dept=sc.next();
		
		Student s=new Student();
		s.setName(name);
		s.setId(id);
		s.setDept(dept);
		s.setEmail(email);
		s.setMarks(marks);
		s.setContact(contact);
		
		stud[i]=s;
		
		
		}
				
		
	}
		
		public void showDetails()
		{
		
			System.out.println(Arrays.toString(stud));
		}
	
	     
		public void updateData()
		{
			System.out.println("\nPut the specific id or name to be updated");
			int id=sc.nextInt();
			
			
			for(int i=0;i<stud.length;i++)
			{
				if(stud[i].getId()==id )
				{   
				    System.out.println("put new contact");
				    String contact=sc.next();
					System.out.println("put new  email");
					String email=sc.next();
					stud[i].setEmail(email);
					stud[i].setContact(contact);
					
					System.out.println("Imformation updated Sucessfully");
				}
				
				
			}
			
		}
		
		public void searchData()
		{
			System.out.println("Enter id or name to be Searched ");
			int id=sc.nextInt();
			
			
			for(int i=0;i<stud.length;i++)
			{
				if(stud[i].getId()==id )
				{
					System.out.println(stud[i]);
				}
			}
		}
	
		
		
	
}
