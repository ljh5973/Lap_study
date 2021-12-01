package edu.java.interface03;

public class InterfaceMain03 {

	
	public static void main(String[] args) {
		
		Customer customer1= new Customer();
		customer1.sell();
		customer1.buy();
		customer1.age();
		
		Buyer customer2 = new Customer();
		
		customer2.buy();
		// 생성된 인스턴스는 Customer 타입이지만 참조 변수 선언을 Buyer로 했기 떄문에, Buyer 인터페이스의 메서드만 보임.
		// 강제 타입 변환(casting)을 사용하면 Seller 인터페이스의 메서드도 사용 가능.ㅁㅊㄴㅇ686
		
		if(customer2 instanceof Customer) {
			((Customer)customer2).sell();
		}
		
		if(customer2 instanceof Seller) {
			((Seller)customer2).sell();
		}
		
		Customer customer3 = new Customer();
		
		customer3.order();
		
	}
}


// 상위 클래스 상속(extends) 구현(implements)를 동시에 하는 경우
class SuperClass{

}

interface MyInterface{
	
}

class SubClass extends SuperClass implements MyInterface{
	
}

// 두 개 이상의 인터페이스를 구현하는 경우 : 

interface Buyer{
	void buy();
	
	// 다른 인터페이스에서 같은 signature(리턴 타입, 이름, 파라미터)를 갖는 default 메서드가 있는 경우
	default void order() {
	
		System.out.println("Buyer order");
	}
}

interface Seller{
	void sell();
	
	// 다른 인터페이스에서 같은 signature(리턴 타입, 이름, 파라미터)를 갖는 default 메서드가 있는 경우	
	default void order() {
		System.out.println("Seller order");
	}
}

// 2개 이상의 인터페이스를 구현하는 클래스에서 default method 이름이 중복되는 문제를 override로 해결해야만 한다.
class Customer implements Buyer, Seller{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("판매");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("구매");
	}
	
	public void age() {
		System.out.println("age");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		Seller.super.order();
		Buyer.super.order();
	}
	


	
}