package abstractionassignments;

public interface InterfaceTestCar {
	
	
void milage (int a);
void breaktest(int b);
void speedtest(String g);
void loadtesting (String l);
void crash(int a);
	
	
}

class Swift implements InterfaceTestCar
{

	
	public void milage(int a) {

		System.out.println("Milage of a car "+a);
	}

	
	public void breaktest(int b) {
		
		System.out.println("Rating for break test "+b);
		
	}

	
	public void speedtest(String g) {

		System.out.println("Rating for speed test "+g);
	}


	public void loadtesting(String l) {

		
		System.out.println("Rating for load testing is "+l);
	}

	
	public void crash(int a) {

		
		System.out.println("Rating for crash test is "+a);
	}
	
	
	void dashboard(int a,String b)
	{
		
		System.out.println("Number of speakers in dash board "+ a+"\nAdditional lighting included"+b);
	}
	
	
	
	
	
}
