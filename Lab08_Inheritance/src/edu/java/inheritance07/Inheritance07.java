package edu.java.inheritance07;



// final : 최종적인(마지막의), 변경할 수 없는
// 1) 변수 앞 ( 멤버 변수, 지역 변수, 파라미터) 앞 - 변경할 수 없는 변수. 상수.
// 2) 클래스 앞  - 변경할 수 없는 클래스. 상속할 수 없는 클래스.

public class Inheritance07 {

	private static final int MAX= 3;
	public static void main(String[] args) {
		
		// MAX= 5;
		
		final int n= 10;
//		n=100;
		
	}
}

class A{
	public void test() {}
	public final void testFinal() {}
	
}

class B extends A{
	
}
