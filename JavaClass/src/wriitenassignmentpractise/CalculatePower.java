package wriitenassignmentpractise;
import java.util.Scanner;
public class CalculatePower {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		 int p=1,b=1; 
		 
		 System.out.println("Enter base number");
	      int a=sc.nextInt();
	      System.out.println("Enter Index number");
	      int c=sc.nextInt();
		 
		 while(b<=c)
		 {
			 p=p*a;
			 b++;
			 
		 }
		 System.out.println("Power Of A Given base and index is = " +p);

	}

}
