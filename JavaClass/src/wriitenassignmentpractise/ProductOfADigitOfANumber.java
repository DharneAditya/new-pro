package wriitenassignmentpractise;

public class ProductOfADigitOfANumber {

	public static void main(String[] args) {
		
		int num=146,r,p=1;
		
		while(num!=0)
		{
			r=num%10;
			p=p*r;
			num=num/10;
		}
		System.out.println("Product of a number is  = "+p);

	}

}
