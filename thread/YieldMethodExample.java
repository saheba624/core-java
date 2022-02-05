package thread;

public class YieldMethodExample extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("child thread");
			Thread.yield();
		}

	}

	public static void main(String[] args) {
		YieldMethodExample e = new YieldMethodExample();
		e.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("main thread");
		}

	}
}