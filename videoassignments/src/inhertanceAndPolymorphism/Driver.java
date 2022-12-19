package inhertanceAndPolymorphism;

public class Driver {

	int licenseNo;
	String name;
	public int getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
 public String toString ()
 {
	 return licenseNo+" "+name;
 }
	
}
