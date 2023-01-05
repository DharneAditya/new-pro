package inheritance;

public class AmgMercedes extends Car {

	String dashBoard,color;
	
	int safetyRating;

	public String getDashBoard() {
		return dashBoard;
	}

	public void setDashBoard(String dashBoard) {
		this.dashBoard = dashBoard;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSafetyRating() {
		return safetyRating;
	}

	public void setSafetyRating(int safetyRating) {
		this.safetyRating = safetyRating;
	}
	
	
	  public String toString() 
	  { 
		  return dashBoard+" "+color+" "+safetyRating; 
	  
	  }
	 
	
	
	
	
	
}
