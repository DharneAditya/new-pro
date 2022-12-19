package arrayContainment;
import java.util.Arrays;
import java.util.Scanner;
public class IdProofPersonMain {

	public static void main(String[] args) {
		
		Person p[]=new Person[2];
		Scanner sc=new Scanner (System.in);
		
		
		for(int i=0;i<p.length;i++)
		{
			IdProof i1[]=new IdProof[2];
			System.out.println("Enter person name");
			String name=sc.next();
			System.out.println("Enter person id");
			String id=sc.next();
			System.out.println("Enter person address");
			String address=sc.next();
			System.out.println("Enter person Id Proof");
			for(int j=0;j<i1.length;j++)
			{
			  System.out.println("Enter Id Proof Name");
			  String name2 =sc.next();
			  System.out.println("Enter IdProof validity");
			  int validity=sc.nextInt();
			  i1[j]=new IdProof(name2,validity);
			}
			
			p[i]=new Person(id,name,address,i1);
		}

		
		for(Person a:p)
		{
			for(IdProof q:a.i)
			{
				if(q.getName().equalsIgnoreCase("Pancard"))
				{
					System.out.println(a.getAddress()+" "+a.getName()+" "+q.getName());
				}
			}
		}
		
		
	}

}
