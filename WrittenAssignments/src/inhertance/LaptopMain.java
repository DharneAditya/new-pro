package inhertance;

public class LaptopMain {

	public static void main(String[] args) {
		
		Laptop l1=new Laptop();
		l1.setNoOfUsbPorts(4);
		l1.setProcessorSpeed(5500);
		
		
		System.out.println("No of Usb ports Are  "+l1.getNoOfUsbPorts()+"\nProcessor Speed Is "+l1.getprocessorSpeed()+"Hz");
	}

}
