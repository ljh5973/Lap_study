package edu.java.modifier01;

// 접근제한 수식어(access modifier)
// 1. 종류 : private , (package), protected, public
// 2. 기능:
// 	(1) field(멤버 변수)에 대한 접근 권한을 제한.
//	(2) method에 대한 접근 권한을 제한
//	(3) 생성자에 대한 접근 권한을 제한.

// 3. 의미:
//	(1) private : 선언된 클래스 내부에서만 직접 접근(사용)이 가능.
//	(2) (package) : 같은 패키지에 있는 클래스들에서 직접 접근(사용)이 가능. 수식어를 사용하지 않는 경우.
//	(3) protected : 같은 패키지에 있거나, 상속을 받는 클래스 안에서 직접 접근(사용)이 가능.
//	(4) public : 어디서든지 직접 접근(사용)이 가능.

// 가시성(visibility) 범위: private <(package) < protected < public

public class ModifierMain01 {

	public static void main(String[] args) {
		
		AccessTest test = new AccessTest();
		
		
	}
}
