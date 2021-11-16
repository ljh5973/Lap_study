package edu.java.modifier03;

import edu.java.modifier02.PublicClass;

// 클래스의 가시성(visibility)
// 1. public class: 어디에나 공개된 클래스.
//	(1) 같은 패키지에서는 import문 없이 사용 가능.
//	(2) 다른 패키지에 있으면, import문을 사용하거나 또는 패키지 이름을 포함한 full name으로 사용 가능
// 2. (package) class: 수식어 없이 선언된 클래스. 같은 패키지 안에서만 공개된 클래스.
//	패키지 공개 수준의 클래스는 다른 패키지에서는 import 자체가 되지 않음.
//	public으로 선언하는 클래스는 클래스의 이름과 java 파일(source code)의 이름이 반드시 같아야 한다.!!!!!!
//	하나의 java file에는 public 클래스는 오직 하나만 선언해야 한다.
//	하나의 java file에는 public이 아닌(package 가시성) 클래스를 함께 선언하는 것은 가능.
// -> 클래스마다 각각의 파일에 작성하는 것을 권장.

//public class B{} 하나의 파일에public이 두 개 있을 수 없음.

class A{	//public이 아는 class는 하나의 파일에 함께 선언 가능하다.	권장하지 않음.
	
}

public class ModifierMain03 {

	public static void main(String[] args) {
		
		PublicClass publicClass= new PublicClass();
		
		

	}
}
