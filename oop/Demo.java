package oop;

public class Demo {
	int a;
	int b;

	public static void main(String[] args) {
		Demo d = new Demo();
		d.setAdditionA(30);
		d.setAdditionB(20);
		int a = d.getAdditionA();
		int b = d.getAdditionB();
		System.out.println(a + b);
	}

	public void setAdditionA(int x) {
		this.a = x;
	}

	public void setAdditionB(int y) {
		this.b = y;
	}

	public int getAdditionA() {
		return a;
	}

	public int getAdditionB() {
		return b;
	}
}
