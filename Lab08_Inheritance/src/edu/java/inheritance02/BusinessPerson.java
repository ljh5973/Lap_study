package edu.java.inheritance02;

public class BusinessPerson extends Person{

	
	private String company;
	
	public BusinessPerson() {
		super(); // 상위 클래스의 기본 생성자를 명시적으로 호출
		System.out.println("BusinessPerson 생성자 호출");
	}
	
	
	
	public BusinessPerson(String name, int age, String company) {
//		this.setAge(age);	// parent class의 private field를 접근하기 위해서는 public 메서드를 이용해야함.
//		this.setName(name);
//		this.company=company;
		
		super(name,age);
		this.company=company;
		System.out.println("name과 age와 company를 준 경우");
		
	}

	public BusinessPerson(String company) {
		super();
		this.company = company;
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company=company;
	}
	
	
	
	
	
	
	
	
}

// 상속 관계에서 생성자 호출 순서
// 1. 하위 클래스의 생성자를 호출하면, 상위 클래스의 생성자가 먼저 호출된다.
// 2. 하위 클래스의 생성자에서 상위 클래스의 생성자를 명시적으로 호출하지 않으면 
// 상위 클래스의 기본(super())를 자동으로 호추함.
// 3. 하위클래스의 생성자에서 상위 클래스의 생성자를 명시적으로 호출할 수도 있음
// super(); 또는 super(param, ...); 형식으로 호출함.
// 비교 - 같은 class의 다른 생성자(overloading된) 생성자를 호출 할 때는 this(), this(param, ...); 형식으로 사용
// 4. 상위 클래스가 기본 생성자를 갖고 있지 않고, Parameter가 있는 생성자만 갖고 있을 때,
// 하위 클래스에서 반드시 상위 클래스의 생성자를 명시적으로 호출해야만 함.
// -> 해결 방법 1: 상위 클래스에서 기본 생성자를 만듦.
// -> 해결 방법 2: 하위 클래스에서 상위 클래스의 파라미터가 있는 생성자를 "명시적"으로 호출.