package nestedForloopAssignment;

public class MirrorStarPyramid {

	public static void main(String[] args) {
		int r=5;
		for(int i=1;i<=r;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int g=1;g<=i;g++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
