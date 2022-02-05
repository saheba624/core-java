package thread;

import com.oop.practice.Shape;

public class Circle extends Shape implements Runnable {
	public static void main(String[] args) {
		Circle c = new Circle();
		Thread th = new Thread(c);
		th.run();
	}
@Override
public void run() {
System.out.println("hello thread");	
}
}
