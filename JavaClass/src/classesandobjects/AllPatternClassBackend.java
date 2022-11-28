package classesandobjects;

public class AllPatternClassBackend {

	void DecOppositeStarPat()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int s=5;s>=i;s--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
	
	void IncNumArrowUptofive()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
       for(int i=4;i>=1;i--)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print(j);
    	   }
    	   System.out.println();
       }
	}

	void IncNumArrowUptoNine()
	{
		for (int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i=8;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	void IncNumPalindromePatUptoFive()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int r=i-1;r>=1;r--)
			{
				System.out.print(r);
			}
			
			System.out.println();
		}
		for (int i=4;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		}
		
		void IncNumPalindromePatUptoFiveStar()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.print("*");
				for(int j=1;j<=i;j++)
				{
					
					System.out.print(j);
				}
				for(int r=i-1;r>=1;r--)
				{
					System.out.print(r);
				}
				System.out.print("*");
				
				System.out.println();
			}
			for (int i=4;i>=1;i--)
			{
				System.out.print("*");
				for (int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				for(int k=i-1;k>=1;k--)
				{
					System.out.print(k);
				}
				System.out.print("*");
				System.out.println();
			
			}
		}
		
		void IncNumPyramid()
		{
			for(int i=1;i<=7;i++)
			{
				for(int k=7;k>=i;k--)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
				
		}
		
		void SameNumPyramid()
		{
			for(int i=1;i<=7;i++)
			{
				for(int j=7;j>=i;j--)
				{
					System.out.print(" ");
				}
				for (int k=1;k<=i;k++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
		
		void PalindromeNumPyramid()
		{
			for(int i =1;i<=9;i++)
			{
				for(int j =9;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k);
				}
				for(int l=i-1;l>=1;l--)
				{
					System.out.print(l);
				}
				System.out.println();
			}
		}
			
			
	       
		
		
		
		
		
		
		
		
		
		
	
	
}
