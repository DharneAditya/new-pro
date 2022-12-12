package encapsulation;

public class EncapsulationGooglePayMain {
	
	public void tranferAmmount (int amount,EncapsulationAccount ac1)
	{
		System.out.println("Transaction in process");
		ac1.setBalance(ac1.getBalance()-amount);
		System.out.println("Transaction Succesful");
		System.out.println("Updated balance of accno "+ac1.getAccno()+"\nis rupees"+ac1.getBalance());
	}

	
	
	
	
	
	

	public static void main(String[] args) {
		
		EncapsulationAccount a1=new EncapsulationAccount();
	    a1.setAccno(1234);
	    a1.setBalance(35000);
	    a1.setName("Ramesh");
		
		
		EncapsulationGooglePayMain a2=new EncapsulationGooglePayMain();
		
		a2.tranferAmmount(2000,a1);

	}

}
