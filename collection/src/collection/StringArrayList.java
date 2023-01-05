package collection;

import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> str=new ArrayList();
		
		str.add("Jan");
		str.add("Feb");
		str.add("Mar");
		str.add("Apr");
		str.add("May");
		str.add("Jun");
		str.add("Jul");
		str.add("Aug");
		str.add("Sep");
		str.add("Oct");
		str.add("Nov");
		str.add("Dec");
		
		System.out.println("The length of a Arays list is "+str.size());
		
		
		for(String r:str)
		{
			if(r.contains("e"))
			{
				System.out.println(r);
			}
		}

	}

}
