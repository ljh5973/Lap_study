package edu.java.method01;


// 메서드(method): 프로그램의 기능을 코드 블록으로 작성한 것.
// 메서드는 클래스 안에서 정의함.
// 메서드는 다른 메서드 안에서는 정의(선언)할 수 없음!
// 메서드 선언 방법:
//	[수식어] 리턴타입 메서드이름(파라미트 선언, ... ) {...}
//	수식어 - public, private, static, ...
// 리턴타입: 메서드의 실행이 끝난 후 메서드를 호출한 곳으로 반환되는 데이터의 타입.
//	void: 메서드가 반환하는 값(데이터) 가 없다는 의미.
// 파라미터(parameter): 매개변수, 인자
// 메서드의 입력값(메서드를 호출하는 곳에서 메서드에게 전달하는 값)을 저장하기 위한 지역 변수.
// argument를 저장하기 위한 메서드 내부 지역 변수.
// argument: 인수  - 메서드를 호출하는 곳에서 메서드에게 전달하는 값.
public class MethodMain01 {

	public static void main(String[] args) {
		
		
		System.out.println("1.");
		MethodMain01 m = new MethodMain01();
		m.newLine(5);
		System.out.println("2.");
		m.newLine(3);
		System.out.println("3");
		
		
	}
	
	
	public void newLine(int number) {
		for(int i=0; i<number; i++) {
			System.out.println();
		}
	}
}
