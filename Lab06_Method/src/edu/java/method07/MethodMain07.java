package edu.java.method07;

public class MethodMain07 {

	
	public static void main(String[] args) {
		
		// 가변 길이 argument 메서드(variable-length argument method):
		// 메서드의 argument 개수가 자유롭게 변할 수 있는 메서드.
		// 단, 메서드 argument의 타입은 1개
		
		int result=addAllIntegers();
		System.out.println(result);
		result=addAllIntegers(1,5);
		System.out.println(result);
		
		result=addAllIntegers(1,2,3,4,5);
		
		System.out.println(result);
		
		System.out.printf("%s %d %f","문자열",100,3.14);
	}
	// 가변 길이 인수를 저장하는 파라미터를 선헌할 때는
	// 타입... 변수이름
	// 형식으로 선언.
	
	public static int addAllIntegers(int... num) {

		int sum=0;
		
		
		
		//메서드 내부에서 가변 길이 인수는 배열처럼 생각하면 됨.
		for(int x: num) {
			sum+=x;
		}
		return sum;
	}
}
