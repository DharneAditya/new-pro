package javaclass;

public class OddNumberWhileLoop {

	public static void main(String[] args) {
		
		int num=229, r=521;
		
		while(r>=num)
		{
			if(r%2==1)
			{
				System.out.println(r+"");
			}
			r--;
		}

	}

}
