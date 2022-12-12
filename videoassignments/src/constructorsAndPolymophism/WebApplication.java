package constructorsAndPolymophism;

public class WebApplication {
 public String userName,password;
 static int heatCounter=0;
 
 
 WebApplication()
 {
	 userName="Aditya";
	 password="****";
	 heatCounter++;
 }
 
 WebApplication(String userName,String password)
 {
	 this.userName=userName;
	 this.password=password;
	 heatCounter++;
 }
	
 
 public void ShowDetails()
 {
	 System.out.println("User name is "+userName+"\nPassword is "+password+"\nHeat counter is "+heatCounter);
 }
	
	
}
