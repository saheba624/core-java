package thread;

public class PriorityThread extends Thread {
	private static final String getId = null;

	public PriorityThread(String name) {
		super("name");
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++)
			System.out.println(getName()+ "....." +getPriority() + "....." +getId());
	}

	public static void main(String[] args) {

		PriorityThread p1 = new PriorityThread("Thread 1");
		PriorityThread p2 = new PriorityThread("Thread 2");
		PriorityThread p3 = new PriorityThread("Thread 3 ");

		p1.setPriority(3);
		p2.setPriority(MIN_PRIORITY);

		p1.start();
		p2.start();
		p3.start();
	}

	

}
