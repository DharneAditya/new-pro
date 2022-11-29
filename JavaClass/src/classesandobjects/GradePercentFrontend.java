package classesandobjects;
import java.util.Scanner;

public class GradePercentFrontend {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner (System.in);
	    System.out.println("Sub 1");
		int a=sc.nextInt();
		System.out.println("Sub 2");
		int b=sc.nextInt();
		System.out.println("Sub 3");
		int c=sc.nextInt();
		System.out.println("Sub 4");
		int d=sc.nextInt();
		System.out.println("Sub 5");
		int e=sc.nextInt();
     	double total =a+b+c+d+e;
       
     	GradePercentBackend c1= new GradePercentBackend();
     	
     	double percent = c1.percent(total);
     	c1.grade(percent);
	}

}
