package oop;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		// Deposit example**********
		a.setBalance(10000);

		System.out.println("Amount Before deposit .... " + a.getBalance());

		int deposit = 30000;
		a.deposite(deposit, a);

		System.out.println("New balance =  " + a.getBalance());

		// Deposit example end*******

		// Withdraw example
		a.setBalance(40000);

		System.out.println("Amount before withdraw .... " + a.getBalance());

		int withraw = 10000;
		a.withdraw(a, withraw);

		System.out.println("Amount after withdraw .... " + a.getBalance());

		// Withdraw example end

		Account a1 = new Account();
		a1.setBalance(100000);
		Account a2 = new Account();
		a2.setBalance(50000);
		int amount =5000;
		a.fundTransfer(amount, a1, a2);

		System.out.println("your balance before fund transfer..... " + a1.getBalance());

		System.out.println("your balance after fund transfer ...... " + a2.getBalance());
	}
}
