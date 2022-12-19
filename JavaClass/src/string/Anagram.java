package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String a="world";
	    String b="wolrd";
	    
	    if(a.length()==b.length())
	    {
	    char array[]=a.toCharArray();
	    char array1[]=b.toCharArray();
	    Arrays.sort(array1);
	    Arrays.sort(array);
	    
	    
	    System.out.println(Arrays.toString(array));
	    System.out.println(Arrays.toString(array1));
	    
	    int flag=1;
	    
	    for(int i=0;i<array.length;i++)
	    {
	    	if(array[i]!=array1[i])
	    	{
	    		System.out.println("Not a anagram array");
	    		
	    		flag=0;
	    		break;
	    		
	    	}
	    	
	    	
	    	
	    }
	    if(flag==1)
    	{
    		System.out.println("Its a anagram array");
    	}
	    
	    
	    
	    
	    
	    
	    
	    
	    }
	    
	}

}
