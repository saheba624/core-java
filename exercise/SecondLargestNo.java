package com.javabasic.exercise;

public class SecondLargestNo {
	public static int getsecondlargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 9, 3, 4 };
		int b[] = { 44, 55, 66, 77, 33, 88, 76 };
		System.out.println("second largest " + getsecondlargest(a, 6));
		System.out.println("second largest " + getsecondlargest(b, 7));
	}
}
