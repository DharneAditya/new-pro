package arrayContainment;
import java.util.Scanner;
public class MovieTheaterMain {

	public static void main(String[] args) {
		
		Theater t[]=new Theater[2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			Movie m[]=new Movie[2];
			System.out.println("Enter theater name");
			String name=sc.next();
			System.out.println("Enter theater id");
			int id=sc.nextInt();
			System.out.println("Fill movie section" );
			
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter name of the movie");
				String name1=sc.next();
				System.out.println("Enter movie id");
				int id1=sc.nextInt();
				System.out.println("Enter movie year Realease");
				int release=sc.nextInt();				
				m[j]=new Movie(id1,release,name1);	
				
			}
			
			t[i]=new Theater(id,name,m);
			
		}
		for(Theater f:t)
		{
		
			System.out.println(f);
			
		}
		
		
		
		
		
	}

}
