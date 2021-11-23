package edu.java.exception07;

public class ExceptionMain07 {

	
	public static void main(String[] args) {
		
		try {
			int x= 123;
			int y=10;

			System.out.println("몫 = "+ (x/y));
			String s = null;
			System.out.println("문자열 길이 = "+s.length());
		} catch (Exception e) {

			System.out.println("예외 발생");
		}finally {
			System.out.println("-----finally-----");
		}
	}
}
