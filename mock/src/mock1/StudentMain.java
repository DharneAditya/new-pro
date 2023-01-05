package mock1;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
	
		
		
		Scanner sc=new Scanner (System.in);
		
		int marks1[]=new int [5];
		
		for(int i=0;i<marks1.length;i++)
		{
			System.out.println("Enter sub 1 marks");
			marks1[i]=sc.nextInt();
			
			
		}
		
		Student s1=new Student ("Student",121,marks1);
		
		s1.totalNumberOfMarks();
		s1.percentage();
		s1.average();
		
		
		
		
		
		
		
		
		
		
		

	}

}
