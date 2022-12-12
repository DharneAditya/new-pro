package abstraction;

public class ElectronicsTelevisionMain {

	public static void main(String[] args) {
	
		Telivison t1=new Telivison();
		t1.setdata(123, 1234, "Black");		
		t1.display();
		t1.electricityConsumption();
		t1.features();
		t1.processor();
		t1.rating();
		t1.semiConductor();
		
		
		
	}

}
