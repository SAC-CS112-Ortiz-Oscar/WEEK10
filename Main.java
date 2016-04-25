// Oscar Ortiz
// Week 10 Homework

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print("Enter number of dice rolls: ");
		int numberOfRolls = input.nextInt();
		
		Dice newDice = new Dice(numberOfRolls);
		int diceRoll = newDice.getDiceRoll();
		
		System.out.print("Guess the number points: ");
		int numberOfPoints = input.nextInt();
		
		if(numberOfPoints == diceRoll)
			System.out.println("You are correct!");
		else
			System.out.printf("You are wrong! \nThe number was %d.", diceRoll);

	}

}
