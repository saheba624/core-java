package oop;

public class ReturnType {
	public static void main(String[] args) {

		String s = getmax(5, 10);
		System.out.println(s);

	}

	public static String getmax(int a, int b) {
		if (a > b) {
			return "a is greater";

		}
		if (b > a) {
			return "b is greater";

		}
		return "both are equal";
	}
}