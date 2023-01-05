package test2;
import test1.Parent;
public class Child extends Parent{

	
	String schoolName;
    String fevSport;
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getFevSport() {
		return fevSport;
	}
	public void setFevSport(String fevSport) {
		this.fevSport = fevSport;
	}
    
    public String toString()
    {
    	return schoolName+" "+fevSport;
    }
}
