package forloop;

public class SameNumberReversePyramid {

	public static void main(String[] args) {
		
		for(int a=4;a>=1;a--)
		{
			for(int c=4;c>=a;c--)
			{
				System.out.print(c+"");
			}
			System.out.println();
		}
	}

}
