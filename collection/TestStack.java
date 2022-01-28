package collection;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Ram");
		s.push("Shyam");
		s.push("Jai");
		s.push("Vijay");

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}


