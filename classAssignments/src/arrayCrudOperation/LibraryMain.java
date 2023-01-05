package arrayCrudOperation;
import java.text.ParseException;
import java.util.Scanner;
public class LibraryMain {

	public static void main(String[] args) throws ParseException {
	
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Choose option");
		System.out.println("\n1 for display books");
		System.out.println("2 for issue books");
		System.out.println("3 for showtransaction");
		System.out.println("4 for return books");
		System.out.println("5 for Show no of books");
		
		
		
		Library l=new Library();
				
		char ch='y';
		
		
	while(ch =='y')
	{
		
		System.out.println("\nEnter your choice");
		
		int choice =sc.nextInt();
		
		switch(choice)
		{
		case 1:
			l.displayBooks();
			break;
		
		case 2:
		   l.issueBook();
		   break;
		
		case 3:
			l.showTransaction();
			break;
			
		case 4:
			l.returnBook();
			break;
			
		case 5:
			l.showNoOfBooks();
			break;
			
		case 6:
			l.fineCollection();
			break;
		
		default:
			System.out.println("Invalid input");
		System.out.println("Try Again");
		ch=sc.next().charAt(0);
		}
		System.out.println("Do you want to continue press y/n");
		ch=sc.next().charAt(0);
	}
		
		
		
		
		
		
		
		
		

	}

}
