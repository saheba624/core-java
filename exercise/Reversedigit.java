package com.javabasic.exercise;

//Reverse Digit

public class Reversedigit {
	public static void main(String[] args) {
		int num = 123456, reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		System.out.println("reverse number: " + reverse);
	}
}
