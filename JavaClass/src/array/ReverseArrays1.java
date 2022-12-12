package array;

import java.util.Arrays;

public class ReverseArrays1 {

	public static void main(String[] args) {
		
      	int 	a[]= {1,2,3,4,5,6,7,8};
      	
      	int n=a.length;
      	int mid=a.length/2;
      	int i=0;
      	System.out.println(a[n+i-4]);
      	System.out.println(Arrays.toString(a));
      	
      	for( i=0;i<mid;i++)
      	{
      		int temp=a[i];
      		a[i] =a[n+i-4];
      		a[n-4+i]=temp;
      		
      	}
      	
      	System.out.println(Arrays.toString(a));
	}

}
