package polymorphism;

public class AreaOfShapes {
	
	void area(int r)
	{
		System.out.println("Area Of circle is ="+(3.14*(r*r)));
	}

	void area (int l,int b)
	{
		System.out.println("Area of Rectrangle is = "+(l*b));
	}
	
	void area (int l,int h,double c)
	{
		System.out.println("Area of traingle is = "+(l*h*c));
	}
	
	void area(float a)
	{
		System.out.println("Area of square is = "+(a*a));
	}
	public static void main(String[] args) {
		
		AreaOfShapes a1=new AreaOfShapes();
		
		a1.area(20);
		a1.area(20, 30);
		a1.area(20, 30, 0.5);
		a1.area(3.5f);
		

	}

}
