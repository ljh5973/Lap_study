package edu.java.method02;


public class MethodMain02 {

	public static void main(String[] args) {
		
		MethodMain02 m = new MethodMain02();
		
		
		double result=m.add(2.3, 4.555);
		double subResult=m.subtract(5.5, 3.5);
		double multiResult=m.multiply(5.5, 2.5);
		double divideResult=m.divide(52.2, 5.3);
		
		System.out.println(result);
		System.out.println(subResult);
		System.out.println(multiResult);
		System.out.println(divideResult);
		
		
	}
	
	
	
	/**
	 * double type의 숫자 2개를 입력 받아서, 두 수의 합을 반환(return)하는 메서드.
	 * @param x double
	 * @param y double
	 * @return x+y
	 * 
	 */
	
	public double add(double x, double y) {
		
		return x+y;
	}
	
	/**
	 * 
	 * double type 의 숫자 2개를 입력 받아서, 두 수의 차를 반환(return)하는 메서드.
	 * 
	 * @param x double
	 * @param y double
	 * @return x-y
	 */
	
	public double subtract(double x, double y) {
		return x-y;
	}
	
	/**
	 * 
	 * double type 의 숫자 2개를 입력 받아서, 두 수의 곱셈을 반환(return)하는 메서드.
	 * 
	 * @param x double
	 * @param y double
	 * @return x*y
	 */
	
	public double multiply(double x, double y) {
		return x*y;
	}
	
	/**
	 * 
	 * double type 의 숫자 2개를 입력 받아서, 두 수의 나눗셈을 반환(return)하는 메서드.
	 * 
	 * @param x double
	 * @param y double
	 * @return x/y
	 */
	
	public double divide(double x, double y) {
		return x/y;
	}
}
