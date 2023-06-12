/**
 * Chap7Program2
 * Usage of Multiple Classes 
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-05
 */

public class Chap7Program2 {

	public static void main(String[] args) {
		
		Bicycle bike;
		Account acctMinseok;

		String myName = "Minseok Seo";

		bike = new Bicycle();
		bike.setOwnerName(myName);

		acctMinseok = new Account();
		acctMinseok.setOwnerName(myName);
		acctMinseok.setInitialBalance(250.00);

		acctMinseok.add(25.00);
		acctMinseok.deduct(50);

		// Output some information
		System.out.println(bike.getOwnerName() + " owns a bicycle and");
		System.out.println("has $ " + acctMinseok.getCurrentBalance() + " left in the bank");

	}

}
