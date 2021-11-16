package edu.java.inheritance03;

public class InheritanceMain03 {

	public static void main(String[] args) {
		
		// 메서드 override
		
		
		// Car 인스턴스 생성
		Car c1= new Car(50);
		
		c1.drive();
		
		// ElectricCar 인스턴스 생성
		Car ec1= new ElectricCar(40,100);
		
		ec1.drive();
	}
}
