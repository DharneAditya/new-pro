package string;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Java Language";
		
		char ch='a';
		int count=0;
		char ch1[]=s.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
		for(int i=0;i<ch1.length;i++)
		{
			if (ch1[i]=='a')
			{
				ch1[i]='A';
			}
		}
		
		String s1=new String(ch1);
		
		System.out.println(s1);
	}

}
