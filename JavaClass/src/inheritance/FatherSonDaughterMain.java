package inheritance;

public class FatherSonDaughterMain {

	public static void main(String[] args) {
		Son s1=new Son();
		s1.setAge("54");
		s1.setCollege("RcErT");
		s1.setName("Babu bhaiya");
		s1.setSonAge("26");
		s1.setSonName("balvir");
		s1.setSurname("khurana");
		
		System.out.println(s1.getAge()+"father age \n"+s1.getName()+"father name \n"+s1.getSurname()+"surname \n");
		System.out.println(s1.getSonAge()+" son age\n"+s1.getSonName()+" son name\n");
		
		Daughter d1 =new Daughter();
		d1.setAge("54");
		d1.setCollege("IIT");
		d1.setName("babu");
		d1.setDaughterAge("26");
		d1.setDaughterName("Shalini");
		d1.setSurname("Khurana");
		System.out.println(d1.getAge()+"father age \n"+d1.getName()+" father name \n"+d1.getSurname()+" surname \n");
		System.out.println(d1.getDaughterAge()+" Daughter age\n"+d1.getDaughterName()+" Daughter name\n");

	}

}