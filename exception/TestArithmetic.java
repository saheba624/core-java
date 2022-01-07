package com.exception;

public class TestArithmetic {
	public static void main(String[] args) {
		int i =100;
		int j = 0;
		try {
		double div=i/j;
		System.out.println("div is" + div);
		}
		catch(ArithmeticException e) {
			System.out.println("divided by zero");
		}

}
}
