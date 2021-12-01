package edu.java.exception05;

import java.util.Scanner;

public class ExceptionMain05 {

	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	// try- catch 활용
		
		
		double x= inputDouble();
		double y= inputDouble();
		
		
		System.out.println("x + y = "+ (x+y));
		System.out.println("x - y = "+ (x-y));
		System.out.println("x * y = "+ (x*y));
		System.out.println("x / y = "+ (x/y));
		
		
	}
	
	private static double inputDouble() {
		
		double number= 0.0;
		
		while(true) {
			
			try {
				
				System.out.println("숫자 입력>>");
				String s= scan.nextLine();
				number=Double.parseDouble(s);
				
				return number;
				
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		
	}
}
