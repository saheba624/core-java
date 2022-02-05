package thread;

public class testWithoutThread {
	public static void main(String[] args) {
		WithoutThread t1 = new WithoutThread();
		t1.setName("ram");
		
		WithoutThread t2 = new WithoutThread();
		t2.setName("Shyam");
		t1.run();
		t2.run();
	}
	

}
