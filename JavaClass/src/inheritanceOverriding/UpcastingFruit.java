package inheritanceOverriding;

public class UpcastingFruit {
	
	void taste()
	{
		System.out.println("Taste is good");
		
	}

}
class Apple extends UpcastingFruit
{
	void taste ()
	{
		System.out.println("Taste is nice");
	}
}

class Strawberry extends UpcastingFruit
{
	void taste()
	{
		System.out.println("Taste is delicious");
	}
}