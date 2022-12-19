package array;

public class EqualArrays {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[]= {1,2,3,4,5,6,7,8,9,10};
		
           int count =0;
          
           if(a.length==b.length)
           {
        	   System.out.println("Both the arrys length is are same ");
        	   
        	   
               for(int i=0;i<b.length;i++)
               {
            	   if(a[i]==b[i])
            	   {
    	            count=count+1;
            	   }
               }
       
               if(count==a.length)
               {
            	   System.out.println("\n"+count);
            	   
            	   
            	   System.out.println();
            	   
            	   System.out.println("Both the Arrys are same");
            	   
               }
               else
               {
            	   System.out.println("Both the Arrys are not same");
               }
           }
           
           else
           {
        	   System.out.println("Both the arrys length is not equal hence they are not equal arrys ");
           }
           
           
          


	       }

}
