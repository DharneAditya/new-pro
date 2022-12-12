package constructorsAndPolymophism;

public class BankStaticMain {

	public static void main(String[] args) {
		
		AccountStatic a1=new AccountStatic(1212,25000f,"Ramesh");
		a1.display();
		AccountStatic.changeInIRate(5.6f);
		a1.display();
		float ab =AccountStatic.iRate;
		System.out.println("direct printing Static variable"+ab);

	}

}
