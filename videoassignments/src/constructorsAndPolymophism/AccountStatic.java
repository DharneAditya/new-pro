package constructorsAndPolymophism;

public class AccountStatic {

	public int accNo;
	public float balance;
	protected String name;
	
	public static String bankname="Sbi Bank";
	public static float iRate=7.2f;
	
	public static void changeInIRate(float newRate)
	{
		iRate=newRate;
	}
	
	AccountStatic(int accno, float balance,String name)
	{
		this.accNo=accno;
		this.balance=balance;
		this.name=name;
	}
	
	public void display ()
	{
		System.out.println("accNo is "+accNo);
		System.out.println("Account balance is "+balance);
		System.out.println("Account name is "+name);
		System.out.println(" User Bank name "+name);
		System.out.println("inter rate is "+iRate);
	}
	
	
	
	
}
