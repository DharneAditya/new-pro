package array2d;
import java.util.Scanner;
public class Literals {

	public static void main(String[] args) {
		       
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter row And coloumn");
		
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] numbers=new int[r][c];
		
		
		System.out.println("Enter the first arrays elements");
		
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			numbers[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++)
		{
		
			for(int j=0;j<c;j++)
			{
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
