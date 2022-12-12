package constructorsAndPolymophism;

public class ShoppingJava {
	
	public void doOnlineTransactions(CreditCard a)
	{
	  a.useCard();
	}
	
	public void doOnlineTransactions(DebitCard d)
	{
		d.useCard();
	}
	
	
	
	

	public static void main(String[] args) {
		
		ShoppingJava s1=new ShoppingJava();
		CreditCard c1=new CreditCard();
		s1.doOnlineTransactions(c1);
		s1.doOnlineTransactions(new DebitCard());
			
		

	}

}
