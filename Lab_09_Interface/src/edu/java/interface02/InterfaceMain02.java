package edu.java.interface02;

// 인터페이스가 가질 수 있는 멤버들 - Java 8 버전 이후의 변경 사항
// 1) public static final 필드(멤버 변수)
// 2) public abstract method 
// 3) public default method - Java 8 버전부터 생김. body({...})가 구현된 메서드.
// 4) public static method - Java 8 버전부터 생김. body({...})가 구현된 static 메서드.
// - public default method는 인터페이스를 구현하는 클래스의 객체를 생성한 후에 참조 변수를 통해서 사용 가능.
// - public static method는 객체 생성 없이 인터페이스 이름으로 접근해서 사용 가능.
// 5) private static method, private method - Java 9 버전부터 생김. body({...})가 구현된 메서드
// - private static method는 인터페이스의 public static method만 사용하기 위한 목적으로 생김.
// - private method는 public default 메서드만 사용하기 위한 목적으로 생김.

public class InterfaceMain02 {

	
	public static void main(String[] args) {
		// public static final field - 객체 생성 없이 interface 이름으로 사용
		
		int a=Test.VERSION;
		
		// public static method -> 객체 생성 없이 interface 이름 사용해서 호출
		Test.test3();
		
		// public abstract method, public default method -> interface 구현 클래스의 인스턴스를 생성한 후 사용 가능.
		
		TestImpl t1= new TestImpl();
		t1.test1();
		t1.test2();
		
		
		
	}
}

interface Test{
	
	// 1. public static final field
	int VERSION =1;	// public static final 생략
	
	// 2. public abstract method
	void test1();	// public abstract 생략
	
	// 3. public default method - Java 8
	default void test2() {
		System.out.println("default method");
	}
	
	// 4. public static method - Java 8. public 생략 가능.
	static void test3() {
		
	}
	
}

class TestImpl implements Test{

	@Override
	public void test1() {
		System.out.println("interface abstract method ");
		
	}
	
}