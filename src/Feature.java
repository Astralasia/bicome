
public abstract class Feature 
{	
	
	public enum Fenotype
	{
		NONE, SMALL, MEDIUM, LARGE
	}
	
	public enum Genotype
	{
		NONE, rr, Rr, RR
	}
	
	private Fenotype fenotype;
	
	
	/**
	 * Sets the fenotype for the organism.
	 * 
	 * @param   fenotype - the fenotype of the organism
	 */
	public void setFenotype( Fenotype fenotype )
	{
		this.fenotype = fenotype;
	}
	
	public Fenotype getFenotype()
	{
		return fenotype;
	}
	
	

}
