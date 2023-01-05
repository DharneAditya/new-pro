package mock1;

public class Student {

	String name;
	int id;
	double perc,av;
    int total=0;


	int marks[]=new int [5];

    Student (String name, int id, int marks[])
    {
    	this .name=name;
    	this.id=id;
    	this.marks=marks;
    }
    
    public void totalNumberOfMarks()
    {
    	
    	for(int i=0;i<marks.length;i++)
    	{
    		total=total+marks[i];
    		System.out.println("Total number of are = "+total);
    	}
    }
    
    
    public void percentage()
    {
    	perc=(total/100)*80;
    	
    	System.out.println("percentage are"+perc);
    }

    public void average()
    {
    	av=total/5;
    	System.out.println("Average is "+av);
    }
 public String toString ()
 {
	 return name+" "+id+" "+marks;
 }


}
