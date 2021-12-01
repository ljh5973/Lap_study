package edu.java.Inheritance06;

public class InheritanceMain06 {

	public static void main(String[] args) {
		// Object 클래스의 메서드 override : toString(), hashCode(), equals() ...

		Point p1 = new Point();

		System.out.println(p1.getClass());
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1);
		// System.out.println(Object) 메서드는 파라미터에 전달된 객체에서 toString() 메서드를 호출하고,
		// 그 객체의 toString() 메서드가 리턴해 주는 문자열을 콘솔창에 출력.
		// - > 클래스를 작성할 때 toString() 메서드를 overrride하면 출력문의 형식을 바꿀 수 있음.

		Point p2= new Point(0,0);
		
		// ==, != 연산자는 인스턴스가 생성된 주소값(참조값)을 직접 비교.
		System.out.println(p1==p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		// Object 클래스의 equals() 메서드는 원래 hashCode() 값으로 같은 지 다른 지 비교를 하고 있었지만,
		// Point 클래스에서 override한 equals() 메서드는 멤버 변수(필드) x, y 값으로 같은지 다른지 비교
		System.out.println(p1.equals(p2));
	
		
		// Object 클래스의 hashCode() 메서드는 인스턴스가 생성된 메모리 주소값을 리턴하고 있지만,
		// Point 클래스에서 override한 hashCode() 메서드는 equals()가 true일 때 같은 정수 값이 되도록 구현.
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Point p3= new Point(66,7);
		
		System.out.println(p3.hashCode());
		
		String str1= new String("aa");
		String str2= new String("aa");
		
		
		
		System.out.println(str1==str2); // false; ==은 주소값을 비교한다
		System.out.println(str1.equals(str2));	//true
		
		// 기본 타입(boolean, int ,double ,..)의 같음/ 다름 비교는 ==, != 연사자를 사용.
		// 참조 타입(String, Object, ..)의 같음/다름 비교는 equals() 메서드를 사용.
		
		
	}
}

class Point {
	private double x;	// x 좌표
	private double y;	// y 좌표
	
	public Point() {
		
	}
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {

		boolean result= false;
		if(obj instanceof Point) {	// 파라미터 obj가 Point 타입의 인스턴스이면
			Point p=(Point) obj;
			if(this.x==p.x && this.y==p.y) {
				result=true;
			}
		}
		
		return result;
	}
	@Override
	public int hashCode() {
		// equals() 메서드가 true를 리턴하는 인스턴스들은 hashCode()의 리턴값이 같아야 함!
		
		
		return (Double.valueOf(x).hashCode() * 10 + Double.valueOf(y).hashCode())*-1;
	}
	
	
	
	
	
	
}
