package inheritance;

public class Electronics {

	private int currentInput,currentOutPut;
	private int energySaving,semiConductor;
	
	
	Electronics(int currentInput,int currentOutPut,int energySaving,int semiConductor)
	{
		this.currentInput=currentInput;
		this.currentOutPut=currentOutPut;
		this.energySaving=energySaving;
		this.semiConductor=semiConductor;
	}
	
	public String toString()
	{
		
		return currentInput+" "+ currentOutPut+" "+energySaving+" "+semiConductor;

	}
	
	
}
