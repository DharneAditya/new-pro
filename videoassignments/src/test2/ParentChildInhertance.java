package test2;

public class ParentChildInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child c=new Child();
		
		c.setAge(12);
		c.setFevSport("Hockey");
		c.setName("Rohan");
		c.setSchoolName("MOunt");
		c.setSurName("Dharne");
		
		System.out.println(c.getAge()+" "+c.getName()+" "+c.getSurName()+c.getFevSport()+" "+c.getSchoolName());
	}

}
