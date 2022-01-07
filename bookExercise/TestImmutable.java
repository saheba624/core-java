package com.oop.bookExercise;

public class TestImmutable {

	public static void main(String[] args) {
		ImmutableClass im= new ImmutableClass("Saheba", "Ansari");
		System.out.println(im.getName());
		System.out.println(im.getSurname());
	}
}
