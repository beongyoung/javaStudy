/**
 * Chap7Program3
 * Dice rolling randomly
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-05
 */

public class Chap7Program3 {

	public static void main(String[] args) {
		
		Dice diceOne = new Dice(), diceTwo = new Dice();
		
		diceOne.roll();
		System.out.println(diceOne.getNumber());
		
		diceTwo.roll();
		System.out.println(diceTwo.getNumber());
	}
}