package arrayContainment;

public class Movie {

	int id,yearRelease;
	String name;
	
   public  Movie(int id,int yearRelease,String name)
	{
	  this.id=id;
	  this.yearRelease=yearRelease;
	  this.name=name;
			  
	}
	
   public String toString()
   {
	   return id+" "+yearRelease+" "+name;
   }
	
 
}
