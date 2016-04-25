
public class Dice 
{
	Dice(int numberOfRolls)
	{
		upperBound = numberOfRolls * 6;
		lowerBound = 1;
	}
	
	public int getDiceRoll()
	{
		return generateRandomNumber(lowerBound,upperBound);
	}
	
	private int generateRandomNumber(int lowerBound, int upperBound)
	{
		return lowerBound + (int)(Math.random() * upperBound);
	}
	
	private int upperBound;
	private int lowerBound;
}
