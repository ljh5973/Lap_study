package edu.java.inner03;

// 외부 클래스(outer/enclosing class)
public class EnclosingCls {
	// member variable
	private int instanceVar; // instance variable - constructor 호출 이후에 메모리에 (Heap)에 생성되는 변수

	public static int classVar = 100; // static variable , class variable - 프로그램
	// 									로딩 시점에(main method시작 전)에 메모리(method 영역)에 생성되는 변수

	// constructor
	public EnclosingCls(int instanceVar) {
		this.instanceVar = instanceVar;
	}

	// method
	// instance method(static 이 아닌 method, instance가 생성되어야만 사용할 수 있는 method)

	public void printMember() {

		System.out.println("--- instance method call ---");
		System.out.println("인스턴스 변수 = "+ instanceVar);
		System.out.println("Class Variable = "+ classVar);
	}
	
	// class method (static method, instance(객체)생성 전에도 사용할 수 있는 method)
	
	public static void staticMethod() {
		System.out.println(" --- class method call ---");
//		System.out.println("instance variable = " + instanceVar);
		System.out.println("class variable =" + classVar );
		// static method 안에서는 static이 아닌 member는 사용할 수 없다.
	}
	// static(member) 내부 클래스 - 중첩 클래스(Nested class)
	// - 외부 클래스의 생성자 호출 전(인스턴스 생성 전)에도 생성자를 호출할 수 있는 내부 클래스.
	// - 외부 클래스의 인스턴스와 무관한 클래스.
	// - 외부 클래스의 static member들만 접근이 가능
	public static class NestCls{
		private String value;
		
		
		// 생성자
		public  NestCls(String value) {
			this.value=value;
		}
		
		public void nestedClassmethod() {
			System.out.println("value = "+this.value);
		}
	}
}
