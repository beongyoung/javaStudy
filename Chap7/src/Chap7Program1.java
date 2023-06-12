/**
 * Chap7Program1
 * Usage of Multiple Classes 
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-05
 */

public class Chap7Program1 {

	public static void main(String[] args) {

		Bicycle bike1, bike2;
		String owner1, owner2;

		bike1 = new Bicycle(); // Create and assign values to bike1
		bike1.setOwnerName("Minseok Seo");

		bike2 = new Bicycle(); // Create and assign values to bike2
		bike2.setOwnerName("IU");
		
		owner1 = bike1.getOwnerName(); // Output the information
		owner2 = bike2.getOwnerName();

		System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle.");

	}

}


