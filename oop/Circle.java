package oop;

public class Circle extends Shape {
	private double radius;
	private static final double PI = 3.14;
	
	public Circle() {
		
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super(radius);
		this.radius = radius;
	}

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	@Override
	public double area(){

		Circle circle = new Circle();
		double r = getRadius();
		System.out.println("Area of circle is " + PI * r * r);
		return r;
	}
}
