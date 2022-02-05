package thread;

public class RacingConditionThread extends Thread{
	public static Account data = new Account();
	String name = null;

	public RacingConditionThread(String name) {
		this.name = name;
	}

	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 5; i++) {

			data.deposit(name, 1000);
		}
	}

	public static void main(String[] args) {

		RacingConditionThread t1 = new RacingConditionThread("saheba");
		RacingConditionThread t2 = new RacingConditionThread("zameer");

		t1.start();
		t2.start();

	}
}
