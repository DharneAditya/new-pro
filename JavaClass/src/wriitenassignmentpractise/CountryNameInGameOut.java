package wriitenassignmentpractise;
import java.util.Scanner;
public class CountryNameInGameOut {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter country Name");
		String ch=sc.next();
		switch(ch)
		{
		case "india": System.out.println("National game of india is Hockey"); 
		break;
		case "china" :System.out.println("National game of china is Table Tennis"); 
		break;
		case "bangladesh" :System.out.println("National game of bangladesh is kabaddi"); 
		break;
		case "italy" :System.out.println("National game of italy is Football"); 
		break;
		case "us" :System.out.println("National game of us is baseball"); 
		break;
		}

	}

}
