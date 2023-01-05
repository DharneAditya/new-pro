package inheritanceOverriding;

public class PersonDoctorPatientmain {

	public static void main(String[] args) {
		
		Doctor d=new Doctor();
		
		d.setName("Salman");
		d.setAge(39);
		d.setContact("65353");
		d.setGender("MALE");
		d.setId(4674);
		d.setSpecialization("Child");
		d.setLisence("346");
		System.out.println("Doctor imformation");
		d.display();
		
		System.out.println();
		
		Patient p=new Patient();
		p.setName("Riha");
		p.setAge(12);
		p.setContact("no contact");
		p.setGender("female");
		p.setId(001);
		p.setBedno(89);
		p.setDisease("No disease");
		System.out.println(" patient imformation");
		p.display();

		
		
		
		
		
		
		
		

	}

}
