package classesandobjects;
import java.util.Scanner;
public class MovieBackend {

void movie()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter movie id");
	int a=sc.nextInt();
	System.out.println("Enter movie name");
	String b=sc.next();
	System.out.println("Enter movie Reaease date");
	int c=sc.nextInt();
	System.out.println("Enter name of the producer");
	String d=sc.next();
	
	System.out.println(a+" "+b+" "+c+" "+d);
	
	
}
	      
	
	
	
	
}
