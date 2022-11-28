package inheritance;

public class ECMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EngineEn e1=new EngineEn();
		
		e1.setPower(1300);
		e1.setTorque(121);
		e1.setName("Maruti");
		
	
		CarEn c1=new CarEn();
		
		c1.setId(121);
		c1.setId("Suzuki");
		c1.setPrice(50000);
        c1.setE(e1);
        
        
        System.out.println(c1.getId()+" "+c1.getCname()+" "+c1.getPrice()+"\n"+c1.getE());
	}

}
