package nestedForloopAssignment;

public class AssignmentLoopstestingClass {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			System.out.print("*");
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j);
			}
			for(int r=i-1;r>=1;r--)
			{
				System.out.print(r);
			}
			System.out.print("*");
			
			System.out.println();
		}
		for (int i=4;i>=1;i--)
		{
			System.out.print("*");
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.print("*");
			System.out.println();
		}
		

	}

}
