package constructorsAndPolymophism;

public class Area {

	
	public void calculateAreaMethod(float i)
	
	{
		System.out.println("Area of circle is  "+(3.14*(i*i)));
	}
	
	public void calculateAreaMethod(int l,int b)
	{
		System.out.println("Area of Rectrangle is  "+(l*b));
	}
	
	public double calculateAreaMethod(int h,double b)
	{
		double area=(0.5*b*h);
		return area;
	}
	
}
