package inhertance;

public class CarAudiQ8Main {

	public static void main(String[] args) {
		
	       AudiQ8  a1 = new AudiQ8();
	       	       
	       a1.setHeadlights(2);
	       a1.setViper(2);
	       a1.setWheelNo(4);
	       a1.setAutomaticIgnition("Q8Iginition");
	       a1.setSeatWarmer("new warmer");
	       
	       System.out.println(a1.getAutomaticIgnition()+"\n"+a1.getHeadlights()+"\n"+a1.getSeatWarmer()+"\n"+a1.getViper()+"\n"+a1.getWheelNo());

	}

}
