package string;

import java.util.Arrays;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abbcaabbcaab";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]=='b' && ch[i+1]=='c' && ch[i+2]=='a')
			{
				ch[i]='0';
				ch[i+1]='0';
				ch[i+2]='0';
			}
		}
		
		System.out.println(Arrays.toString(ch));
		
		
	}

}
