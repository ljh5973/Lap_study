package edu.java.inheritance03;

public class InheritanceMain03 {

	public static void main(String[] args) {
		
		// 메서드 override
		
		
		// Car 인스턴스 생성
		Car c1= new Car(50);
		
		c1.drive();
		
		
		
		
		
		// ElectricCar 인스턴스 생성
		Car car2= new ElectricCar(40,100);		
		car2.drive();
	
		// 
		
		
		// 다형성(polymorphism) : 하나의 인스턴스를 여러가지 타입으로 부를 수 있는 것.
		// 인스턴스를 자식 타입으로 생성하고, 그 인스턴스를 가리키는 참조 변수를 
		// 자식 타입으로도, 부모 타입으로도 선언할 수 있는 것퓨ㅠ ㅍ
		// line 16 는 "참조 변수 car2는  Electrice 타입이다 " 
		
		Car car3= new ElectricCar(0,0);
		car3.drive();
		// 실제 인스턴스는 ElectricCar이지만, 참조 변수를 부모 타입인 Car라고 선언했기 때문에,
		// 부모 타입의 멤버(변수, 메서드)만 보임!
		// ELectricCar 클래스가 가지고 있는 getCharge, setCharge 메서드가 보이기지 않음.
		// 실제로 생성된 인스턴스는 자식 타입의 멤버(변수, 메서드)를 가지고 있기 때문에,
		// 타입 변환(casting)을 하면 모든 멤버들을 사용할 수 있음.
		ElectricCar ee= (ElectricCar)car3;
		ee.getCharge();
		
		((ElectricCar) car3).getCharge();
		
		// upcasting: Sub class type의 객체를 생성하고 Super class 타입의 변수에 저장하는 것.
		// downcasting : Super type으로 선언된 변수를 Sub 타입으로 "명시적" 으로 Type 변환하는 것.
		// line 31 - upcasting, line 38 - downcasting
		
		Car[] cars= new Car[3];
		
		
		
	}
}
