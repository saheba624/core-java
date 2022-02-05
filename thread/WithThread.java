package thread;

public class WithThread extends Thread {
	private String name= null;
	Thread t1 = new Thread();
	
	public WithThread(String name) {
		this.name=name;
	}
	@Override
public void run() {
	for (int i = 0; i < 5; i++) {
		t1.yield();
		System.out.println(i+"hello " + name);

}

}
}
