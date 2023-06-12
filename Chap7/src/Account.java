/**
 * Account class for Chap7Program2
 * Usage of Multiple Classes 
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-05
 */

public class Account {
	
	private String ownerName;
	private double balance;

	public Account() {
		ownerName = "Unassigned";
		balance = 0.0;
	}

	public void add(double amt) {
		balance = balance + amt;
	}

	public void deduct(double amt) {
		balance = balance - amt;
	}

	public double getCurrentBalance() {
		return balance;
	}

	public String getOwnerName() {

		return ownerName;
	}

	public void setInitialBalance(double bal) {

		balance = bal;
	}

	public void setOwnerName(String name) {

		ownerName = name;
	}

}
