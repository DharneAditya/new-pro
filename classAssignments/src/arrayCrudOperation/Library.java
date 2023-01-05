package arrayCrudOperation;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
public class Library {

	Scanner sc= new Scanner (System.in);
	
	Book b[]=new Book[5];
	Date issueDate=null;
	Date returnDate=null;
	Date  newReturnDate=null;
	Transaction t[]= new Transaction [5];
	StudentL s[]=new StudentL[5];
	int count=0;
	int noOfTotalBooks=25;
	int fine=0;
	SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd");
	
	
	
	
	
	
	Library()
	{
		
    b[0]=new Book(01,3, "a", "Kalyan verma");
	b[1]=new Book(02,4, "b", "David Attenborough");
	b[2]=new Book(03,5, "c", "Chetan Bhagat");
	b[3]=new Book(04,6, "d", "Jim Corbet");
	b[4]=new Book(05,7, "e", "Romolus Whitaker");
	
	
	}
	
	
	
	 public int displayBooks()
	 
	{
		 int totalBook=0;
		 
		System.out.println(Arrays.toString(b));
				
		 
		  
		  for(int i=0;i<b.length;i++) 
		  {
		  totalBook=totalBook+b[i].getCopyNo();
		  
		  
		  }
		  
		  
		  System.out.println("\nTotal number of books are ="+totalBook);
		 
		  return totalBook;

	}
	
	
	public void issueBook() throws ParseException   

	{
		while(noOfTotalBooks>=1)
			
		{
			
			   String az=sc.nextLine();
			    System.out.println("Enter Book name");
			    String bookName=sc.nextLine();
			    System.out.println("Enter issue date in the form yyyy/MM/dd");   
			   issueDate= sdf.parse(sc.next());
			   String stt=sdf.format(issueDate);
			   issueDate= sdf.parse(stt);
			   
			   Calendar c1=Calendar.getInstance();
			    
			    c1.setTime(issueDate);
			    c1.add(Calendar.DAY_OF_MONTH,5 );
			    String dte=sdf.format(c1.getTime());
			    returnDate= sdf.parse(dte);
			    
				System.out.println("Enter student id");
				int id=sc.nextInt();
				System.out.println("Enter Student name");
				String name=sc.next();
				System.out.println("Enter Student Contact");
				String contact=sc.next();
				System.out.println("Enter Student Department");
				String dept=sc.next();
				System.out.println("Enter Student Email");
				String email=sc.next();
				s[count]=new StudentL(id,name,email,contact,dept);
				System.out.println();
	            
				t[count]=new Transaction(bookName,issueDate,returnDate,s);
			
				count++;
				
				break;
		}
		
		for(int i=0;i<t.length;i++)
		{
			if(t[i]!=null)
			{
			for(int j=0;j<b.length;j++)
			{
			
				if(b[j].getName().equals(t[i].getBookName()))
				{
			
					b[j].setCopyNo(b[j].getCopyNo()-1);
					
					noOfTotalBooks=noOfTotalBooks-1;
				}
				
			}
			
			}
		}
		
				
		}
	
	
	public void returnBook()
	{
		System.out.println("Your return date was "+returnDate);
		System.out.println("Enter book name");
		String bookName=sc.next();
		System.out.println("Enter Student id");
		int id=sc.nextInt();
		
		
		
		
		for(int i=0;i<t.length;i++)
		{
			if(t[i]!=null && s[i].getId()==id)
			{
				if(b[i].getName().equals(bookName))
				{
					b[i].setCopyNo(b[i].getCopyNo()+1);
					noOfTotalBooks=noOfTotalBooks+1;
					
					System.out.println("Enter new Return date in the form yyyy/MM/dd");
					
					  String strDate=sc.next();
					    try {
					    	newReturnDate=sdf.parse(strDate);
					    }
					    catch(Exception ex)
					    {
					    	System.out.println("Invalid Date");
					    }
					if(newReturnDate!=returnDate)
					{
						System.out.println("500 rs fine");
						fine=fine+500;
					}
					
					
				}
			}
		}
		
		
	}
	
	
	 public void showTransaction()
	       
	 {
	    	   System.out.println(Arrays.toString(t));
	    	   
	 }
	       
	 
	 public void showNoOfBooks()
	 {
		 System.out.println(noOfTotalBooks);
		 
		 System.out.println(Arrays.toString(b));
	 }
	      
	 public void fineCollection()
	 {
		 System.out.println(fine);
	 }
	       
	       
	
}
