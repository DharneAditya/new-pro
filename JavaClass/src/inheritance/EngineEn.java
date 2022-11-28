package inheritance;

public class EngineEn {

	private int power,torque;
	private String cname;
	
	public int getPower()
	{
		return power;
	}
	
	public void setPower(int power)
	{
		this.power=power;
	}
	
	public int getTorque()
	{
		return torque;
	}
	
	public void setTorque(int torque)
	{
		this.torque=torque;
	}
	
	public String getCname()
	{
		return cname;
	}
	
	public void setName(String cname)
	{
		this.cname=cname;
	}
	
	public String toString()
	{
		return power+" "+torque+" "+cname;
	}
	
	
}
