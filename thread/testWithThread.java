package thread;

public class testWithThread {
public static void main(String[] args) {
	WithThread t1 = new WithThread("saheba");
	WithThread t2 = new WithThread("zameer");
	
	t1.start();
	t2.start();
	
	for (int i = 0; i < 5; i++) {
		System.out.println(i+ " Main Thread");
	}
}
}
