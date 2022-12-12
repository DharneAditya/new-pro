package constructorsAndPolymophism;

public class AreaMain {

	public static void main(String[] args) {
		
		Area a1=new Area();
		a1.calculateAreaMethod(3.5f);
		double a =a1.calculateAreaMethod(12, 3.5);
		System.out.println("Area of Triangle is "+a);
		a1.calculateAreaMethod(7, 10);
		
		
		

	}

}
