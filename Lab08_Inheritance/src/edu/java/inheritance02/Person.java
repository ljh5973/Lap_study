package edu.java.inheritance02;



// 회사원(BusinessPerson)은 사람(Person)이다.
// Person - super classm businessPerson -sub class
public class Person {

	//필드(멤버 변수, 속성, 특성)
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person 생성자 호출");
	}
	
	
	
	public Person(String name, int age) {
		super();
		System.out.println("꿍까");
		this.name = name;
		this.age = age;
		
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
