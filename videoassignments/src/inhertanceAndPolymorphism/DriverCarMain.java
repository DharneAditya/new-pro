package inhertanceAndPolymorphism;
import java.util.Scanner;
public class DriverCarMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Driver d=new Driver();
		d.setLicenseNo(1212);
		d.setName("Ramesh");
		
		Car c=new Car();
		c.setD(d);
		c.setMake("Honda");
		c.setRegistrationNO(1234);
		
		System.out.println(c.getD()+" "+c.getRegistrationNO()+" "+c.getMake());
		
		

	}

}
