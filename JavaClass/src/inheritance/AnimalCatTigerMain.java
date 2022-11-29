package inheritance;

public class AnimalCatTigerMain {

	public static void main(String[] args) {
	
		Tiger t1=new Tiger();
		
		t1.setEyes("2");
		t1.setLeg("4");
		t1.setTail("1");
		t1.setHousecat("no");
		t1.setWildCat("yes");
		t1.setColor("YEllow");
		t1.setHeight("6ft");
		t1.setWeight("250kg");
		
		
		System.out.println(t1.getEyes()+"Eyes "+t1.getLeg()+"Legs "+t1.getTail()+"Tail \n"+t1.getHousecat()+" House cat "+t1.getWildCat()+" wild cat");
        System.out.println(t1.getColor()+" "+t1.getWeight()+" "+t1.getHeight());
	}

}
