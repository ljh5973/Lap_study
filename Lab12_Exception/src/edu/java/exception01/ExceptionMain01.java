package edu.java.exception01;

public class ExceptionMain01 {

// 오류(error) vs 예외(exception)
// 오류(error)의 종류
// 1. compile error: 문법적인 오류. 소스 코드를 class 파일로 변환 불가능. -> 반드시 수정
// 2. out-of-memory(OOM) error: 컴퓨터의 메모리가 부족해서 발생하는 에러. -> 수정 불가능
// 3. 논리적인 오류 : 프로그램은 정상적으로 실행/ 종료가 되는데, 원하는 결과가 나오지 않는 경우. -> 반스시 수정 힘듦
// 4. 에외(exception): 프로그램이 실행 중에 발생할 수 있는 비정상적인 상황 -> 반드시 수정
	public static void main(String[] args) {
		
		System.out.println();
		String s="";
		System.out.println(s.length());
		
		
		if(s!= null) {
			System.out.println(s.length());
		}else {
			System.out.println("문자열이 생성되어 있지 않습니다.");
		}
		
		int x= 123;
		int y=10;
		System.out.println("몫 = "+ (x/y));
		
	}
}
