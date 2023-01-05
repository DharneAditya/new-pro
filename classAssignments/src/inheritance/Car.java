package inheritance;

public class Car {
	
	int wheelNo,headLights;

	public int getWheelNo() {
		return wheelNo;
	}

	public void setWheelNo(int wheelNo) {
		this.wheelNo = wheelNo;
	}

	public int getHeadLights() {
		return headLights;
	}

	public void setHeadLights(int headLights) {
		this.headLights = headLights;
	}
	
	public String toString()
	
	{
		return wheelNo+" "+headLights; 
	}
	
	
	

}
