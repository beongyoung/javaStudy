
/**
 * The Chap8Program1 program implements an application that
 * simply displays bike's owner based on the multiple classes
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-13
 */

public class Chap8Program1 {
	public static void main(String[] args) {

		Bicycle bike1, bike2;

		bike1 = new Bicycle("Minseok Seo"); // Create and assign values to bike1
		bike2 = new Bicycle("IU"); // Create and assign values to bike2
		
		System.out.println(bike1.getOwnerName() + " owns a bicycle.");
		System.out.println(bike2.getOwnerName() + " also owns a bicycle.");
	}
}