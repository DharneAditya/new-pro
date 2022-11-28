package inheritance;

public class PersonIdMain {

	public static void main(String[] args) {
		IdProof p2=new IdProof();
		p2.setAdress("nre sdf");
		p2.setName("ramesh");
		p2.setNumber(1219);
		PersonId p1=new PersonId();
		p1.setAge(12);
		p1.setContact("9175566");
	
		p1.setName("ramesh");
		p1.setIdProof(p2);
		
		System.out.println(p1.getAge()+" "+p1.getContact()+" "+p1.getIdproof1()+" "+p1.getIdproof1()+" "+p1.getI());
	}

}
