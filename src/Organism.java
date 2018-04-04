import java.awt.Color;

public class Organism 
{
	
	private int speed;
	private int power;
	private int flightEase;
	private int temperatureAdaptation;
	private int stockpiling;
	private int age;
	
	Leg leg;
	
	
	private float survivalRate;
	
	// Work in progress
	public Organism reproduce( Organism o )
	{
		
		return new Organism();
	}
	
	public float calculateSurvivalRate()
	{
		return survivalRate;
	}
	
	public boolean setColor()
	{
		return true;
	}
	
	public Color getColor()
	{
		return new Color(0);
	}
}
