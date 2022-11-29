package classesandobjects;
import java.util.Scanner;
public class HikeFrontend {

	public static void main(String[] args) {
		  HikeBackend c1 =new HikeBackend();
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Salary");
          int a=sc.nextInt();          
          System.out.println("Enter Ratings in charator");
          char ab=sc.next().charAt(0);
          
          c1.hike(a, ab);
          
   		  //System.out.println("Put your Main Salary");
         // int s=sc.nextInt();
          System.out.println("Put PF percentage to be deducted ");
          double b=sc.nextDouble();
          double newsalary=c1.hike(a, ab);
          c1.Pf(newsalary, b);;
          c1.bonus(newsalary);
	}

}
