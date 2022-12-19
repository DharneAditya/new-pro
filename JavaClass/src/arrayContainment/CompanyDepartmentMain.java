package arrayContainment;
import java.util.Scanner;
public class CompanyDepartmentMain {

	public static void main(String[] args) {
	
		Company c[]=new Company[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			Department dept[]=new Department[2];
			System.out.println("Enter company id");
			int id=sc.nextInt();
			System.out.println("Enter company name");
			String name=sc.next();
			System.out.println("Enter Company Department ");
			System.out.println();
			
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter Department name ");
				String dname =sc.next();
				System.out.println("enter Employee number ");
				int empNum=sc.nextInt();
				System.out.println("Enter Department id ");
				int did=sc.nextInt();
				
				dept[j]=new Department(empNum,did,dname);
				
			}
			
			c[i]=new Company (id,name,dept);
		}
		
		for(Company e:c)
		{
			System.out.println(e);
		}
		
	}

}
