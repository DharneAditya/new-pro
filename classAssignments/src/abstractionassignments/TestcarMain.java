package abstractionassignments;

public class TestcarMain {

	public static void main(String[] args) {
		
		Swift c1 =new Swift();
		c1.breaktest(5);
		c1.crash(5);
		c1.milage(55);
		c1.loadtesting("HighLoad");
		c1.speedtest("High Speed");
		c1.dashboard(5, " Ruuning lights in new dash board");
	}

}
