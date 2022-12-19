package arrayContainment;

public class IdProof {

	private String name;
	private int validity;
	
	IdProof(String name,int validity)
	{
		this.name=name;
		this.validity=validity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}
	
	public String toString ()
	{
		return name+" "+validity;
	}
	
}
