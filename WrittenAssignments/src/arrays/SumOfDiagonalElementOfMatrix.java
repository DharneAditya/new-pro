package arrays;
import java.util.Scanner;
public class SumOfDiagonalElementOfMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many rows");
		int r=sc.nextInt();
		System.out.println("Enter how many coloumn");
		int c=sc.nextInt();
		int mat[][]= new int[r][c];
		int sum=0;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element in rows");
				mat[i][j]=sc.nextInt();
			}
			
		}
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					sum=sum+mat[i][j];
				}
			}
				
		}
		System.out.println(sum);
		
		
		
		
		
		

	}

}
