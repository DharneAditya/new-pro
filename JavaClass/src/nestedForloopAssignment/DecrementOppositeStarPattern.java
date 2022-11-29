package nestedForloopAssignment;

public class DecrementOppositeStarPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int s=5;s>=i;s--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		

	}

}
