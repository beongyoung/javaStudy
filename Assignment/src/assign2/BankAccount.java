package assign2;
/**
 * The BankAccount class
 * ownerName, balance, addBalance(), deductBalance(), getter and setter
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

public class BankAccount {
	private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
    public void addBalance(double amount) {
        this.balance += amount;
    }

    public void deductBalance(double amount) {
        if (amount > this.balance) {
            System.out.println("Error: insufficient balance");
        } else {
            this.balance -= amount;
        }
    }
}