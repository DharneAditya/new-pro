package inheritanceOverriding;

public class UpcastingFruitMain {

	public static void main(String[] args) {
		
		UpcastingFruit f1=new UpcastingFruit ();
		f1.taste();
		
		f1=new Apple ();
		f1.taste();
		
		f1=new Strawberry();
		f1.taste();
				

	}

}
