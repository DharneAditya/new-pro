package inhertance;

public class TigerAnimalMain {

	public static void main(String[] args) {
		
		Tiger t1=new Tiger();
		t1.setEars(2);
		t1.setLegs(4);
		t1.setNose(1);
		t1.setStripes("Round Pattern");
		t1.setWeight(300);
		t1.setHeight(6);
		
		System.out.println(t1.getEars()+"\n"+t1.getHeight()+"\n"+t1.getLegs()+"\n"+t1.getNose()+"\n"+t1.getStripes()+"\n"+t1.getWeight());
	}

}
