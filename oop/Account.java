package oop;

public class Account {
	private String number;
	private String accounttype;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(int amount, Account ac) {
		double newBalance = amount + ac.getBalance();
		ac.setBalance(newBalance);
	}

	public void withdraw(Account a, double amount) {
		double newBalance = a.getBalance() - amount;
		a.setBalance(newBalance);
	}

	public void fundTransfer(double amount, Account acc1, Account acc2) {
		if (acc1.balance >= amount) {
			acc1.balance = acc1.balance - amount;
			acc2.balance = acc2.balance + amount;
			System.out.println("Funds successfully transfered.");
		} else {
			System.out.println("Insufficient funds");
		}
	}

}
