package edu.java.inheritance03;

public class ElectricCar extends Car{


	private int charge;
	
	
	public ElectricCar(int speed, int charge) {
		super(speed);
		
		this.charge=charge;
	}
	
	
	
	// method override:
	// 상위 클래스가 가지고 있는 메서드를 하위 클래스에서 재정의하는 것,
	// override를 할 때는 메서드의 signature가 같아야 함.
	// - method return type, name, parameter가 모두 같아야함.
	// override를 할 때 접근 제어 수식어는 상위 클래스의 가시성보다 같거나 넓어지면 됨.
	// - private< (package) < protected < public
	
	
	public int getCharge() {
		return charge;
	}
	
	



	//annotation(어노테이션)
	// - 자바 컴파일러에게 상위 클래스의 메서드 signature와 동일한 지 검사하도록 함.
	@Override
	public void drive() {
		super.drive();	// 상위 클래스의 drive() 메서드를 명시적으로 호출
		System.out.println("현재 남은 전기량"+ charge);
	}
	
	
}
