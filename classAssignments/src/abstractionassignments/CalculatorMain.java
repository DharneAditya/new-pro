package abstractionassignments;

public class CalculatorMain {

	public static void main(String[] args) {
		
		ScientificCalculator s1= new ScientificCalculator();
		s1.add(12, 45);
		s1.power(3, 3, 1);
        s1.division(4, 2);
        s1.multiplication(3, 80);
        s1.subtraction(6, 5);
        s1.sqrt(6);
        s1.square(8);
	}

}
