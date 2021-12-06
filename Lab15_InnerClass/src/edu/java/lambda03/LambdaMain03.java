package edu.java.lambda03;

import edu.java.lambda03.Calculator.Calculable;

public class LambdaMain03 {

	public static void main(String[] args) {
		
		//Caculator(계산기) 객체 생성
		Calculator calculator = new Calculator();
		
		
	
		// 1. 변수 add가 두 숫자의 덧셈 결과가 저장되도록..
		double add = calculator.calculate(1d/*(double)1, 1, 1.0*/, 2D, new Calculable() {

			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		});
		System.out.println("add = "+ add); //->3.0
		
		
		// 2.  변수 subtract가 두 숫자의 뺄셈 결과가 저장되도록...
		// 람다 표현식 사용
		double substract = calculator.calculate(1, 2, (x,y) -> x-y);
		System.out.println("substract = "+ substract); // -> -1.0
	}
}
