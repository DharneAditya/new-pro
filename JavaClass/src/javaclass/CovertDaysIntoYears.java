package javaclass;
import java.util.Scanner;
public class CovertDaysIntoYears {

	public static void main(String[] args) {
		
		int days,Day,weeks,years;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The days");
		days=sc.nextInt();
		
		years=(days/365);
		weeks=(days%365)/7;
		Day=(days%365)%7;
		System.out.println("days into years"+years);
		System.out.println("days into weeks"+weeks);
		System.out.println("days into Day"+Day);
		
	}

}
