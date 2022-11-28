package encapsulation;

public class CustmerMain {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		
		c1.setAccno(1121);
		c1.setBalance(4000);
		c1.setContact("917556874");
		c1.setName("Ramesh");
		c1.setEmail("Ramesh@gmail.com");
		
		Customer c2=new Customer();
		
		c2.setAccno(1123);
		c2.setBalance(5000);
		c2.setContact("1234567890");
		c2.setName("Arjun");
		c2.setEmail("Arju@gmai.com");
		
		
		
		System.out.println(c1.getAccno()+" "+c1.getBalance()+" "+c1.getContact()+" "+c1.getEmail()+" "+c1.getname());
        System.out.println(c2.getAccno()+" "+c2.getBalance()+" "+c2.getContact()+" "+c2.getEmail()+" "+c2.getname());
        c1.setBalance(6000);
        System.out.println(c1.getAccno()+" "+c1.getBalance()+" "+c1.getContact()+" "+c1.getEmail()+" "+c1.getname());
	}

}
