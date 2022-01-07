package com.exception;

public class Q3 {
	public static void main(String[] args) {
		int i=100;
		int j=0;
		System.out.println("before exeption");
		try {
		int k=i/j;
		}
		catch(RuntimeException e) {
		
			System.out.println("Runtime exeption in catch");
		}
		/*
		 * catch(ArithmeticException a) { System.out.println(); }
		 */
		
	}

}
