package edu.java.exception04;

import java.util.Scanner;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		
		while(true) {
			
			try {
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("정수를 입력하세요.");
				int n = Integer.parseInt(scan.nextLine());
				
				System.out.println("n = " +n);
				break;
			} catch (Exception e) {
				System.out.println("정수가 아닙니다.");
			}
		}
		
	}
}
