/**
 * Dice class for Chap7Program3
 * Usage of Multiple Classes 
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-05
 */

public class Dice {

	public static int MAX_NUMBER = 6;
	private static final int MIN_NUMBER = 1;
	private static final int NO_NUMBER = 0;

	private int number;

	public Dice() {
		number = NO_NUMBER;
	}

	// Rolls the dice
	public void roll() {
		number = (int) (Math.floor(Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER);
	}

	// Returns the number on this dice
	public int getNumber() {
		return number;
	}
}
