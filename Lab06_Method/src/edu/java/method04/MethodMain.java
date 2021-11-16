package edu.java.method04;

public class MethodMain {

	public static void main(String[] args) {

		// method overloading(메서드 오버로딩):
		// 메서드 파라미터 개수나 파라미터 타입이 다르면 같은 이름으로 메서드를 선언할 수 있음.
		// (주의) 메서드의 리턴 타입만 다른 경우에는, 같은 이름으로 메서드를 선언할 수 없음

		System.out.println("aaa");
		System.out.println("aaa");
		System.out.println('a');
		System.out.println('a');
		System.out.println();
		System.out.println();

		sayHello("휴잭맨");
	}

	/**
	 * return "안녕하세요~"
	 */

	public static void sayHello() {
		System.out.println("안녕하세요~");
	}

	/**
	 * 
	 * @param name
	 *
	 */

	public static void sayHello(String name) {
		System.out.println(name + "님 안녕하세요~");
	}

	/**
	 * 
	 * @param name
	 * @param i
	 */
	public static void sayHello(String name, int i) {
		System.out.println(name + "님 안녕하세요~");
	}

	/**
	 * 
	 * @param i
	 * @param name
	 */
	public static void sayHello(int i, String name) {
		System.out.println(name + "님 안녕하세요~");
	}
}
