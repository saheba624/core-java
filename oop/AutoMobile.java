package oop;

public class AutoMobile {
private String color;
private int speed;
private String make;
private static int noofgears;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public static int getNoofgears() {
	return noofgears;
}
public static void setNoofgears(int noofgears) {
	AutoMobile.noofgears = noofgears;
}


}
