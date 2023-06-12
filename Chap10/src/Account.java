import java.io.Serializable;

/**
 * Account class
 *  
 * @author Beongyoung Park
 * @version v0.1
 * @since 2023-04-17
 */

public class Account implements Serializable {
	
	// Data Member
	private String ownerName;
	private double balance;
	
	// Constructor
	public Account() {
		ownerName = "Unknown";
		balance = 0.0;
	}
	
	
	// set function
	public void setOwnerName(String name) {
		ownerName = name;
	}
	
	public void setInitialBalance(double bal) {
		balance = bal;
	}
	
	// get function
	public String getOwnerName() {
		return ownerName;
	}
	
	public double getCurrentBalance() {
		return balance;
	}
	
	public void add(double amt) {
		balance = balance + amt;
	}
	
	public void deduct(double amt) {
		balance = balance - amt;
	}
	
	
}
