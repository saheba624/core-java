package oop;

public class TestInfo {

	public static void main(String[] args) {
		MyInfo a = new MyInfo();

		a.setAddress("Momin Pura");
		a.setAge("25");
		a.setCity("Ratlam");
		a.setName("Saheba Ansari");
		a.setPhone("9039847081");

		System.out.println("My name is .... " + a.getName());
		System.out.println("My age is ..... " + a.getAge());
		System.out.println("My city name is ..... " + a.getCity());
		System.out.println("My address is ..... " + a.getAddress());
		System.out.println("My phone no. is..... " + a.getPhone());

	}
}
