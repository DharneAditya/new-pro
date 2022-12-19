package arrayContainment;

import java.util.Arrays;

public class Theater {

	int id;
	String name;
    Movie[] m;
	
    Theater(int id,String name,Movie[] m)
    {
    	this.id=id;
    	this.name=name;
    	this.m=m;
    }
    
    
    public String toString()
	{
    	return id+" "+name+" "+Arrays.toString(m);
	}
	
	
}
