package edu.java.lambda01;

public class LambdaMain01 {

	public static void main(String[] args) {
		
		// 목적 : Calculable 인터페이스를 구현한 클래스의 객체를 사용(메서드 calculate를 호출해서 값을 계산.)
		
		// 1. Calculable을 구현하는 클래스를 정의
		Calculable adder= new Adder();
		System.out.println(adder.calculate(1, 2));
		
		// 2. Calculable을 구현하는 지역 클래스(local inner class)를 정의
		
		class Subtracter implements Calculable{

			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x-y;
			}
			
		}
		
		Calculable subtracter= new Subtracter();
		System.out.println(subtracter.calculate(2, 3));
		
		
		// 3. 익명 내부 클래스 ( anonymous inner class) - 객체 생성과 클래스 정의(선언)을 동시에.
		Calculable multiplier = new Calculable() {

			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x*y;
			}
			
		};
		
		System.out.println(multiplier.calculate(5, 2));
		
		// 4 . 람다 표현식 (lambda expression)
		// 객체 생성과 클래스 정의를 동시에 하는 익명 클래스 객체 생성을 간단히 표현하는 문장.
		// Functional interface인 경우에만 람다 표현식을 사용할 수 있음.
		Calculable divider = (x, y) -> x/y;
		System.out.println(divider.calculate(5, 4));
	}
}
