package polymorphism;

public class TeenagerBigKidMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BigKid k1=new BigKid();
		k1.readBook();
		k1.readBook("PoemBook", 12);
		
		Teenager k2=new Teenager();
		k2.readBook();
		k2.readBook("book", 12);
		
	}

}
