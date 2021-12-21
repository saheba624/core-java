package com.javabasic.exercise;

//Sum of all integer greater than 100 and less than 200 that are divisible 7
public class Integergretsmall {
	public static void main(String[] args) {
		int num = 7;
		int sum = 0;
		for (int i = 100; i < 200; i++) {
			if (i % num == 0) {
				sum = sum + i;

			}
		}
		System.out.println(" Sum of all  number divisible by 7 is: " + sum);

	}
}
