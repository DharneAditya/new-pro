package classesandobjects;

public class GlobalEmployeeBackend {

	int id;
	int salary;
	long contact;
	String name;
	String dept;
	
	void setdata(int a,int b,long c,String d,String e)
	{
		id=a;
		salary=b;
		contact=c;
		name=d;
		dept=e;
		
	}
	
	/*
	 * void display() {
	 * System.out.println("name :- "+name+" ID:- "+id+" dept :- "+dept+" salary :- "
	 * +salary+" contact :- "+contact); }
	 */
	public String toString ()
	{
		return "name :- "+name+" ID:- "+id+" dept :- "+dept+" salary :-" ;
	}
}
