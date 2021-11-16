package edu.java.method03;

public class MethodMain {

	
	public static void main(String[] args) {
		
		//	method에서 return의 의미:
		//	1) 메서드를 호출한 곳으로 값을 반환
		//	2) 메서드를 종료
		
		countDown(5);
	}
	
	
	public static void countDown(int count) {
		
		
		if(count <0) {
			System.out.println(" count 는 0 이상이어야 합니다.");
			return;
		}
		for(int i=count; i>=0; i-- ) {
			System.out.println(i);
		}
	}
}
