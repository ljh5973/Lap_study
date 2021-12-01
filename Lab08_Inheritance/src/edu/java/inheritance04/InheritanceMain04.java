package edu.java.inheritance04;

public class InheritanceMain04 {

	
	public static void main(String[] args) {
		
		
		//다형성(polymorphism)의 장점 - 코드의 재사용성이 높아짐.
		
		String[] names= {"오썜", "홍길동", "허균"};
		
		printArray(names);
		
	}

	private static void printArray(String[] names) {
		
		System.out.print("[");
		for(String str : names) {
			
			System.out.print(str+",");
		}
		System.out.println("]");
		
	}
}
