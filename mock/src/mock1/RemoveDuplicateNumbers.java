package mock1;

import java.util.Arrays;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int ar[]= {10,20,30,40,50,10,20,10,20,0,0,0,0,30,60};
		int temp[]=new int [ar.length];



		Arrays.sort(ar);

		System.out.println(Arrays.toString(ar));
		int count =0;
		for(int i=0;i<ar.length-1;i++)
		{
			
				if(ar[i]!=ar[i+1])
				{
					temp[count]=ar[i];
					count++;
				}
						
		}

		temp[count]=ar[ar.length-1];
		
		System.out.println(Arrays.toString(temp));        







	}
}