package constructors;

public class StaticBlocks {
	static int a=50;
	int b=40;
  static 
  {
	  System.out.println("Enter all the details of the Employees ");
  }
  
  static 
  {
	  System.out.println("importnt :-imformation will be kept private ");
	 
	  StaticBlocks s1=new StaticBlocks();
	  System.out.println(s1.b);
	  
  }
  
  void display()
  {
	  System.out.println(a+" "+b);
  }
	public static void main(String[] args) {
		
		EmployeeStaticBackend e1= new EmployeeStaticBackend(12,400,"riya","mech");
		EmployeeStaticBackend e2= new EmployeeStaticBackend(13,400,"liya","tech");
		EmployeeStaticBackend e3= new EmployeeStaticBackend(14,400,"miya","lech");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
