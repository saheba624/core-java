package oop;

public class Calculator {
	int a = 100;
	int b = 50;

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int sum = obj.setaddition();
		System.out.println("sum is .... " + sum);
	}

	public int setaddition() {
		int sum = 0;
		sum = a + b;
		return sum;

	}
}
