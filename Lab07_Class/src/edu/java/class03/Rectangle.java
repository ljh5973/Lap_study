package edu.java.class03;

public class Rectangle {

	//field - 속성, 데이터
	
	double width; // 가로 길이
	double height; // 세로 길이
	
	
	//생성자
	
	// 1) default constructor: width와 height를 모두 0 으로
	// 2) parameter가 1개인 constructor:width 와 height를 같은 값으로 초기화
	// 3) parameter가 2개인 constructor: width와 height를 둘다 받아서 초기화 
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length) {
		super();
		this.width = length;
		this.height=length;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	
	public double area() {
		
		return height*width;
	}
	
	public double round() {
		
		return (height+width)*2;
	}
	
	
	
	//method - 기능
	// 1) 직사각형의 넓이를 리턴하는 메서드
	// 2) 직사각형의 둘레 길이를 리턴하는 메서드
}
