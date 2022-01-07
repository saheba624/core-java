package com.oop.bookExercise;

public final class ImmutableClass {
private final String name;
private final String surname;

public ImmutableClass(String name,String surname) {
	this.name=name;
	this.surname=surname;
}

public String getName() {
	return name;
}

public String getSurname() {
	return surname;
}

}
