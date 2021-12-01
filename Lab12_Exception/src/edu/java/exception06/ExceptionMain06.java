package edu.java.exception06;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		// finally 구문:
		// try 블록이 정상적응로 모두 실행이 되거나 또는 catch블록에서 예외처리가 끝난 경우
		// 실행해야할 코드가 있다면 finally 블록을 사용함.
		// (주의) try 또는 catch 블록 내부에 return 문이 있는 경우, finally 블록이 실행된 후 return 문이 호출됨!
		
		
		try {
			String s= null;
			System.out.println("문자열 길이= "+ s.length());
			System.out.println("---try 끝---");
			
			return;
		} catch (Exception e) {
			System.out.println("문자열이 null입니다...");
			System.out.println("---catch끝---");
		}
		finally {
			System.out.println("언제 실행될까");
		}
		System.out.println("프로그램 종료..");
	}
}
