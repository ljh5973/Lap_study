package edu.java.inheritance03;

public class Car {

	// field

	private int speed;

	public Car(int speed) {
		super();
		this.speed = speed;
	}
	
	public void drive() {
		System.out.println("자동차 운행 : 현재 speed = "+ speed);
		System.out.println("aa");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
