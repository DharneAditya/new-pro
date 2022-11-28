package wriitenassignmentpractise;

public class PrimeNumber {
	
	public static void main(String []args) {
	int b=400,c,a;
       for(a=300;a<=b;a++)
       {
    	   for(  c=2;c<=a;c++)
    	   {
    		   if(a%c==0)
    		   {
    			   break;
    		   }
    		   
    	   }
    	   if (a==c)
    	   {
    		   System.out.println("prime Numbers are "+c);
    	   }
       }
	}

}
