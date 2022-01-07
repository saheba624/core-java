package com.exception;

public class TestPropagation {
	public static void main(String[] args){
		first();
			
		
	}
	public static void first() {
		try {
			second();
		} catch (MistakeException e) {
			e.printStackTrace();
		}
		
	}
	public static void second() throws MistakeException {
		MistakeException a=new MistakeException();
		throw a;
		
	}


}
