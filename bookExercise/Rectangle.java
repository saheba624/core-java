package com.oop.bookExercise;

public class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		//super.area();
		System.out.println("Area of Rectangle... " + length * width);
	}

}



