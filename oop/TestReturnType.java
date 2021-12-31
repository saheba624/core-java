package oop;

public class TestReturnType {
	public static void main(String[] args) {
		Shape s = getShape(2);
		double area = s.totalArea();
		System.out.println("Area" + area);

	}

	public static Shape getShape(int i) {
		if (i == 1) {
			return new Circle(5);

		}
		if (i == 2) {
			return new Traingle(5, 10);
		}
		return null;
	}
}
