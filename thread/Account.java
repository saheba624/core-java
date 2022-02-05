package thread;

public class Account {
	private int balance = 0;

	public synchronized void  deposit(String message, int amount) {
int bal = getbalance();
setbalance(bal+amount);
System.out.println(message+ " now balance is " + getbalance());
	}

	private void setbalance(int balance) {
		try {

			Thread.sleep(500);
		}

		catch (Exception e) {
		}	
		this.balance=balance;
	}

	private int getbalance() {
		try {

			Thread.sleep(500);
		}

		catch (Exception e) {
		}		
		return balance;
	}
	

}
