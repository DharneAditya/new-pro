package nestedForloopAssignment;

public class EvenAlphabetsIncrement {

	public static void main(String[] args) {
		
		for(char ch='a';ch<='i';ch=((char)(ch+2)))
		{
			for(char c='a';c<=ch;c=((char)(c+2)))
			{
				System.out.print(c+"");
			}
			System.out.println();
		}
	}

}
