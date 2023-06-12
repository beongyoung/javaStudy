package assign2;
/**
 * The program Q6
 * This program > 1000개의 계좌 중 가장잔고가 많은 주인과 금액 출력하는 프로그램
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

import java.util.Random;

public class Q6 {
	public static void main(String[] args) {
		Random rand = new Random();
		BankAccount[] accounts = new BankAccount[1000];

		for (int i = 0; i < 1000; i++) {
			String ownerName = "owner_" + (i + 1);
			double initialBalance = rand.nextDouble() * 50000;
			accounts[i] = new BankAccount(ownerName, initialBalance);
		}

		for (BankAccount account : accounts) {
			account.addBalance(10000);
		}

		BankAccount maxBalanceAccount = findMaxBalance(accounts);

		System.out.println("Owner name: " + maxBalanceAccount.getOwnerName());
		System.out.println("Balance: $" + maxBalanceAccount.getBalance());

	}

	public static BankAccount findMaxBalance(BankAccount[] accounts) {
		BankAccount maxBalanceAccount = accounts[0];
		for (int i = 1; i < accounts.length; i++) {
			if (accounts[i].getBalance() > maxBalanceAccount.getBalance()) {
				maxBalanceAccount = accounts[i];
			}
		}
		return maxBalanceAccount;
	}
}