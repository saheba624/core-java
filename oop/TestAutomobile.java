package oop;

public class TestAutomobile {

	public static void main(String[] args) {
		//AutoMobile test
		AutoMobile a = new AutoMobile();
		a.setColor("yellow");
		a.setSpeed(50);
		a.setMake("Honda");
		a.setNoofgears(4);

		String color = a.getColor();
		int speed = a.getSpeed();
		String make = a.getMake();
		int gear = a.getNoofgears();

		System.out.println("Car color is ...." + color);
		System.out.println("Car Speed is .... " + speed);
		System.out.println("Car is made by...... " + make);
		System.out.println("No of gears are..... " + gear);

		}

}
