package oop;

public class TestShape1 {
	public static void main(String[] args) {
		
		Shape s[]=new Shape[2];
		s[0]=new Circle(5);
		s[1]=new Traingle(10,20);
		double totalArea=0;
		totalArea=calcArea(s);
		System.out.println("Total Area of all shapes is ..... " + totalArea);
	}

	public static double calcArea(Shape[] s) {
		double totalArea = 0;
		for(int i=0; i<s.length; i++) {
			totalArea = s[i].area();
			
		}
		return totalArea;
	}
}
