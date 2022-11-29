package encapsulation;

public class Customer {
	
	
	private int accno ,balance;
	private String name,contact,email;
	
	public void setAccno(int accno)
	{
		this.accno=accno;
	}
	
	public int getAccno()
	{
		return accno;
	}
	
	
	
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public int getBalance()
	{
		return balance;
	}
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	public String getContact()
	{
		return contact;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	

}
