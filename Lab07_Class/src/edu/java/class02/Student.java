package edu.java.class02;


// class: 속성/정보(field) + 기능(method) + 생성자(constructor) -> 데이터 타입
// 생성자 : 객체를 메모리에 생성하고, 객체가 가지고 있는 필드들을 초기화
public class Student {
	
	// field : 학생 객체가 가져야 할 속성/정보
	
	int id; // 학번
	String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}
