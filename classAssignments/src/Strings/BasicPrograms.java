package Strings;

public class BasicPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create String with new keyWord
		
		String s=new String("First String");
		String a=new String("First String");
		String ab="First String";
		String ac="String ac";
				
		
		//Compare using ==.
		System.out.println(s==a);
		System.out.println(ab==ac);
		System.out.println(s.equals(a));
		System.out.println(ab.equals(a));
		
		//Java Program to find length of a String 
		
		System.out.println(s.length()+" "+a.length()+" "+ab.length()+" "+ac.length());
		
		//concatenate two string.
		
		System.out.println(s+a);
		
		String concatenate=s.concat(ac);
		System.out.println(concatenate );
		
		//Java Program to remove trailing white Spaces Of a String.
		
		String asd="Aditya   ";
		
		System.out.println(asd.trim());
		
		//Java Program to remove both leading and  trailing white Spaces Of a String.
		
		String efd="   Aditya    ";
		
		System.out.println(efd.stripIndent());
		
		//Java Program to remove leading white Spaces Of a String.
		
		
		String hgb="   Aditya";
		
		System.out.println(hgb.stripLeading());
		
		//Java Program to remove extra blank Spaces from a String.
		
		String str="Aditya is a developer";
		
		System.out.println(str.replaceAll(" ", ""));
	}

}
