package oop;

public class Calculator1 {
	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();
		int sum = obj.setAddition(10, 60);
		int sub = obj.setSubtaract(70, 30);
		System.out.println("sum is.... " + sum);
		System.out.println("sub is.... " + sub);

	}

	public int setAddition(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}

	public int setSubtaract(int a, int b) {
		int sub = 0;
		sub = a - b;
		return sub;
	}
}