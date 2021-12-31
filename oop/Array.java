package oop;

public class Array {
	public static void main(String[] args) {
		Shape s[] = new Shape[3];
		s[0] = new Shape(5);
		s[1] = new Traingle(10, 20);
		calcArea(s);
	}

	public static void calcArea(Shape[] s) {
		double totalArea = s[0].totalArea() + s[1].totalArea();
		System.out.println("Traingle of area..... " + s[1].totalArea());
		System.out.println(totalArea);

	}
}
