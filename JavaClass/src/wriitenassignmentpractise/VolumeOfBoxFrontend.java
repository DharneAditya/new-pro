package wriitenassignmentpractise;
import java.util.Scanner;
public class VolumeOfBoxFrontend {

	public static void main(String[] args) {
       VolumeOfBoxBackend b1=new VolumeOfBoxBackend();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter lenght");
       int l=sc.nextInt();
       System.out.println("Enter width");
		int w=sc.nextInt();
		System.out.println("Enter height");
		int h=sc.nextInt();
		
		b1.volume(l, w, h);
		
		
	}

}
