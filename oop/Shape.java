package oop;

public class Shape {
	private String color;
	private int borderwidht = 0;

	public Shape() {
		
	}
	public Shape(int i) {
		// TODO Auto-generated constructor stub
	}

	

	public void setBorderwidht(int bw) {
		this.borderwidht = borderwidht;
	}

	public int getborderwidht() {
		return borderwidht;
	}

	public void setColor(String s) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public double totalArea() {
		System.out.println("parent area ,shape area");
		return 0;
	}

	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
