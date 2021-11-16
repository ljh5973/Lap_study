package edu.java.inheritance02;

public class InheritanceMain02 {

	public static void main(String[] args) {
		
		// 상속과 생성자
		
		// Person 기본 생성자 호출
		
		Person p1= new Person();
		System.out.println(p1.getName());
		
		// Person 클래스의 파라미터를 갖는 생성자를 호출
		Person p2= new Person("a", 5);
		System.out.println(p2.getName());
		
		System.out.println();
		
		// BusinessPerson 클래스의 기본 생성자 호출
		
		Person p3= new BusinessPerson();
		System.out.println(p3.getName());
		// -> Person() 생성자가 먼저 호출되고, BusinessPerson() 생성자가 호출됨.
		// BusinessPerson은 Person을 상속받았기 때문이다 Person의 필드를 쓰기위해선 우선 Person이 생성되어야한다..
		
		BusinessPerson p4= new BusinessPerson();
		System.out.println(p4.getName());
		
		BusinessPerson p5 = new BusinessPerson("오쌤", 5, "아이티윌");
		System.out.println(p5.getName());
		
		// BusinessPerson 클래스의 Parameter를 갖는 Constructor를 호출
		

	}


}
