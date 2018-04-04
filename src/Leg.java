
public class Leg extends Feature
{
	
	public Leg( Fenotype fenotype )
	{
		super.setFenotype(  fenotype );
	}
	
	
	public Genotype getGenotype()
	{
		Fenotype toCheck = super.getFenotype();
		
		if ( toCheck == Fenotype.NONE )
		{
			return Genotype.NONE;
		}
		else if ( toCheck == Fenotype.SMALL )
		{
			return Genotype.rr;
		}
		else if ( toCheck == Fenotype.MEDIUM )
		{
			return Genotype.Rr;
		}
		else if ( toCheck == Fenotype.LARGE )
		{
			return Genotype.RR;
		}
		
		return null;
	}
	

}
