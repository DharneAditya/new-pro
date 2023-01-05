package mock1;
import java.util.Scanner;
public class XobinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		String ouputstr="";
	
		char ch[]=str.toCharArray();
	    
	    for(int i=0;i<ch.length;i++)
	    {
	      if(ch[i]>='a' && ch[i]<='z')
	      {
	    	  ch[i]=(char) (ch[i]-32);
	        ouputstr=ouputstr+ch[i];
	      }
	      
	      else if(ch[i]>='A' && ch[i]<='Z')
	      {
	    	  ch[i]=(char) (ch[i]+32);
	    	  ouputstr=ouputstr+ch[i];
	      }
	        
	    }
		
		System.out.println(ouputstr);
		
		
		 String s = sc.nextLine();
		    
		    for(int i=0;i<s.length();i++)
		    {
		        int count =0;
		      
		      for(int j=0;i<s.length();i++)
		      {
		       
		        {
		          count++;
		        }
		        
		      }
		      
		      if(count>0)
		      {
		        
		      }
		    
		    }
		
		
	}

}
