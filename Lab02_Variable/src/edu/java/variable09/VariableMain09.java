package edu.java.variable09;

import java.util.Scanner;

public class VariableMain09 {

	
	public static void main(String[] args) {
		
		// 간단한 성적 처리 프로그램
		// Java, SQL, JSP 과목의 점수(int) 를 Scanner를 사용해서 입력받음,
		// 세 과목의 점수를 출력
		// 세 과목의 총점을 출력
		// 세 과목의 평균을 출력 - 소수점이 계산되도록!
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("java의 점수를 입력하세요 >");
		int java= scan.nextInt();
		System.out.println("sql의 점수를 입력하세요 >");
		int sql= scan.nextInt();
		System.out.println("jsp의 점수를 입력하세요");
		int jsp= scan.nextInt();
		
		int total= java+sql+jsp;
		float average= (float)(java+sql+jsp)/3;
		
		String num= String.format("%.2f", average);
		
		System.out.println("세 과목의 총점은 : " + total+"점 입니다.");
		System.out.println("세 과목의 평점은 : "+ num+"점 입니다.");
		
		
		
		
		
	}
}
