/**
 * Chap9Program1: Assertion test
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-17
 */

public class Chap9Program1 {

	/**
	 * Balance of the Bank Account
	 */
	static double balance;

	public static void main(String[] args) {
		balance = 100;
		
		deposit(20);
		System.out.println("Balance:" + balance);
		
		withdraw(20);
		System.out.println("Balance:" + balance);
	}

	/**
	 * Function to deposit in given account
	 * @param amount
	 * @return balance
	 */
	private static double deposit(double amount) {
		double oldBalance = balance;
		balance += amount;
		assert balance > oldBalance : 
			"Serious Error - balance did not increase after deposit";
		
		return balance;
	}

	/**
	 * Function to withdraw from given account
	 * @param amount
	 * @return
	 */
	private static double withdraw(double amount) {
		double oldBalance = balance;
		balance -= amount;
		assert balance < oldBalance:
			"Serious Error - balance did not decreased after deposit";
		
		return balance;
	}

}
