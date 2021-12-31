package oop;

//import com.javabasic.exercise.Calculator;

public class Setter {
	int sum = 0;

	public static void main(String[] args) {

		Setter obj = new Setter();
		obj.setaddition(5, 5, 5);
		int sum = obj.getaddition();
		System.out.println(sum);
	}

	public void setaddition(int a, int b, int c) {
		sum = a + b + c;
	}

	public int getaddition() {
		return sum;
	}
}
