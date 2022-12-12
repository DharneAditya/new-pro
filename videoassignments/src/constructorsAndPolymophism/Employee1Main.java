package constructorsAndPolymophism;

public class Employee1Main {

	public static void main(String[] args) {
		
		 Employee1 e1=new  Employee1();
		 e1.showDetails();
		 System.out.println();
		 Employee1 e2=new  Employee1(3456,25000,"Nilesh");	 
         e2.showDetails();
	}

}
