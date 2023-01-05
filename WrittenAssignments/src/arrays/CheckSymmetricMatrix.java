package arrays;

import java.util.Scanner;

public class CheckSymmetricMatrix {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many rows");
		int r=sc.nextInt();
		System.out.println("Enter how many coloumn");
		int c=sc.nextInt();
		int mat[][]= new int[r][c];
		int rowCount=0;
		int columnCount=0;
		
		
		
		
		for(int i=0;i<r;i++)
		{
			
			rowCount++;
		}

		for(int j=0;j<c;j++)
		{
			
			columnCount++;
		}
		
		System.out.println(rowCount+" "+columnCount);
		
		if(rowCount==columnCount)
		{
			System.out.println("MAtrix is symetrical");
		}
		else
		{
			System.out.println("MAtrix is not Symetrical");
		}
		
	}

}
