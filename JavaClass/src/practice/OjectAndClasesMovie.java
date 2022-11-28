package practice;

public class OjectAndClasesMovie {

	int no,budget;
	String name,proName;
	
	void details(int no,int budget,String name,String proName)
	{
		this.no=no;
		this.budget=budget;
		this.name=name;
		this.proName=proName;
	}
	
	void showDetails()
	{
     System.out.println(no+" "+budget+" "+name+" "+proName);
	}
	
public static void main(String[]args)
{
	
	
	OjectAndClasesMovie m1=new OjectAndClasesMovie();
	
    m1.details(123, 500000000, "wild", "nalla");
	m1.showDetails();
}	
}
