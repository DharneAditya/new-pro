package forloop;

public class ForLoopFirst {

	public static void main(String[] args) {
		
		int f=30;
		
		
		for(int i=1;i<=f;i++) {
			
			if(i%3==0) {
				continue;
			}
			System.out.println(i+"");
		}
System.out.println("Done");

	}

}
