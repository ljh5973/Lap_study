package edu.java.lambda01;

//Function Interface (함수형 인터페이스) : 오직 한개의 추상 메서드를 갖는 인터페이스
@FunctionalInterface // 컴파일러가 Functional interface인지를 검사하도록 선언하는 annotation
public interface Calculable {
	
	// 상수들은 있어도 되고 없어도 된다.
	double PI = 3.14;
	int TEN = 10;
	int TNE = 10;
	int ten = 10;

	double calculate(double x, double y); // 추상 메서드(abstract method)
	
//	void test();
}