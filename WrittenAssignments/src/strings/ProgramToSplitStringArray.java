package strings;

import java.util.Arrays;

public class ProgramToSplitStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String st="HELLO&WORLD";

		String[] arrOfStr = st.split("@");
	    for (String a: arrOfStr)
	            System.out.print(a+" ");
	}

}
