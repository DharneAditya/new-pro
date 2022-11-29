package inheritance;

public class IdProof {

	private int number;
	private String  name1,adress;
	

    public int getNumber()
    {
   	 return number;
    }
    public void setNumber(int number)
    {
   	this.number=number; 
    }
    
    public String getName1()
    {
   	 return name1;
    }
    public void setName(String name1)
    {
   	 this.name1=name1;
    }
	
	
    public String getAdress()
    {
   	 return adress;
    }
    public void setAdress(String Adress)
    {
   	 this.adress=adress;
    }
	
	public String toString()
	{
		return number+" "+name1+" "+adress;
	}
	
	
	
}
