package constructorsAndPolymophism;

public class WebApplicationMain {

	public static void main(String[] args) {
		
		WebApplication a1=new WebApplication();
		a1.ShowDetails();
		WebApplication a2=new WebApplication("Rohan","*****");
		a1.ShowDetails();
		WebApplication a3=new WebApplication("Rohan","*****");
		a1.ShowDetails();
		WebApplication a4=new WebApplication();
		a1.ShowDetails();
		
	}

}
