package com.exception;

public class Q1 {
	public static void main(String[] args) {
		int i=100;
		int j=0;
		System.out.println("before exeption");
		try {
		int k=i/j;
		}
		/*catch(Exception e) {
			e.printStackTrace();
			System.out.println("exeption in catch");
		}*/
		finally {
			System.out.println("this is finally");
		}
		System.out.println("after exeption");
	}

}
