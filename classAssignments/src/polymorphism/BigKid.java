package polymorphism;

public class BigKid extends Kid{

	
	public void readBook()
	{
		System.out.println("Reading a Big kid Book");
	}

	
	public void readBook(String bookName, int noOfBook) {

		super.readBook(bookName, noOfBook);
		
		System.out.println(bookName+" "+noOfBook);
	}
	
	
	
}
