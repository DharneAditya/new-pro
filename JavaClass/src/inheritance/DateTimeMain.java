package inheritance;

public class DateTimeMain {

	public static void main(String[] args) {
		
		Time t1= new Time();
	    t1.setHr(3);
	    t1.setMin(45);
	    t1.setSec(59);
	    t1.setDd(12);
	    t1.setMm(04);
	    t1.setYy(2022);
	    
	    
	    System.out.println(t1.getHr()+" "+t1.getMin()+" "+t1.getSec()+"\n"+t1.getDd()+" "+t1.getMm()+" "+t1.getYy());

	}

}
