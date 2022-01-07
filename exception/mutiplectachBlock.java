package com.exception;

public class mutiplectachBlock {
	public static void main(String[] args) {
		String name = "vijay";
		try {
			System.out.println("length of name is " + name.length());
			System.out.println("Character of 7th position is " + name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti hai");
		} catch (NullPointerException e) {
			System.out.println("sunder sa naam");
		} finally {
			System.out.println("this is finally");
		}

	}
}
