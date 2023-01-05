package mock1;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//str=AdityaDharne
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		//3,7,11,15,19
		
		
		
		for(int i=0;i<arr.length;i=i+2)
		{
			int c=arr[i]+arr[i+1];
			
			System.out.print(c+" ");
		}
		
		//student data member ,avery stu as a 5 sub marks array of this ...
		
		
		String str="adityadharne";
		
		String st=" ";
		
		char ch[]=str.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char) (ch[i]+2);
			
			st=st+ch[i];
		}
		
		System.out.println(st);

		
		System.out.println(Arrays.toString(ch));
	}
	
	

}
