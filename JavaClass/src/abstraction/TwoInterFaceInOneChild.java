package abstraction;
interface Aa
{
	void add (int a,int b);
	void squareRoot(int a);
}

interface Bb
{
	void square (int a);
	void squareRoot(int a);
}

 class AB implements Aa,Bb
 {

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println(a*a);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void squareRoot(int a) {
		// TODO Auto-generated method stub
		System.out.println(Math.sqrt(a));
	}
	 
 }
public class TwoInterFaceInOneChild {

	public static void main(String[] args) {
		AB c1=new AB();
		c1.add(12, 45);
		c1.square(6);
		c1.squareRoot(8);

	}

}
