package encapsulation;

public class Sudent2 {
	
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void displayData()
{
  
 
  int id =getId();
  System.out.println("return of a get method through display method is "+id);
}



}
