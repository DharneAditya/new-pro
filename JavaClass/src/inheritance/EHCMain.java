package inheritance;

public class EHCMain {

	public static void main(String[] args) {
	
		Engine e1=new Engine(1001,45,"G13bb","Maruti");
		Headlights h1=new Headlights(2,45,"yello","round");
		car c1=new car(123,60000,"Gypsy","maruti",e1,h1);

		
		System.out.println(c1);
		
	}

}
