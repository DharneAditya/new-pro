package nestedForloopAssignment;

public class SameCharReversePyramid {

	public static void main(String[] args) {
		
		for(char ch='e';ch>='a';ch--)
		{
			for (char c='a';c <=ch;c++)
			{
				System.out.print(ch+"");
			}
			System.out.println();
		
		}
	

	}

}
