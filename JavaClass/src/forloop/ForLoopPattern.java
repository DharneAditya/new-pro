package forloop;
import java.util.Scanner;
public class ForLoopPattern {

	public static void main(String[] args) {
		
Scanner sc=new Scanner (System.in);
System.out.println("mention how many row ");
int row=sc.nextInt();

for (int column=1;column<=row;column++)
{
	for (int i=1;i<=column;i++)
	{
		System.out.print("*");
	}
	System.out.println();
	
}
}

}
