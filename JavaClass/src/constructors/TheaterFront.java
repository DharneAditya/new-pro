package constructors;
import java.util.Scanner;
public class TheaterFront {

	public static void main(String[] args) {
		int id,rating;
		String name,address,contact;
		
		
		Scanner sc=new Scanner (System.in);
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter id");
			id=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();
			System.out.println("rating");
			rating=sc.nextInt();
			System.out.println("Enter address");
			address=sc.next();
			System.out.println("Enter contact");
			contact=sc.next();
			
			TheaterBack t1=new TheaterBack(id,rating,name,address,contact);
			System.out.println(t1);
		}
		
		
		
	}

}
