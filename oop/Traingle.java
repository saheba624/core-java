package oop;

public class Traingle extends Shape {
	private int base;
	private int height;
	private static final double CONST = 0.5;

	public Traingle() {
	}

	public Traingle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getbase() {
		return base;
	}

	public int getheight() {
		return height;

	}

	@Override
	public double area() {
		int b = getbase();
		int h = getheight();
		double area = CONST * b * h;
		System.out.println("taringle area--- " + area);
		return area;

	}
}
