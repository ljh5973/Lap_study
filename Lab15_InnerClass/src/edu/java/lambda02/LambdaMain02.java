package edu.java.lambda02;

@FunctionalInterface
interface MyMath {

	double calc(double x, double y);
}

@FunctionalInterface
interface Printable{
	void print(String str);
}

public class LambdaMain02 {

	public static void main(String[] args) {

		// MyMath 인터페이스를 구현- (x-y)의 절대 값

		// 익명 클래스
		MyMath abs = new MyMath() {

			public double calc(double x, double y) {
				double result = 0;
				if (x - y > 0) {
					result = x - y;
				} else {
					result = -(x - y);
				}

				return result;
			}
		};

		
		System.out.println(abs.calc(5, 3));
		System.out.println(abs.calc(3, 5));

		// 람다 표현식
		// (파라미터 선언) -> {메서드가 할 일 구현}
		// 람다 표현식에서는 파라미터를 선언할 때 모든 타입들을 생략할 수 있다.
		// 메서드 블록 안의 내용이 리턴 문장만 있는 경우에는, 중괄호({})와 return까지 생략하고 리턴 값만 써도 된다.
		MyMath abs2 = (x, y) -> {
			double result = 0;
			if (x > y) {
				result = x - y;
			} else {
				result = -(x - y); // y-x 도 같음
			}
			return result;
		};

		System.out.println("--- 람다표현식 ---");
		System.out.println(abs2.calc(1, 2));
		System.out.println(abs2.calc(2, 1));

		
		
		System.out.println("--- 삼항연산자 ---");
		// 삼항연산자
		// (조건식) ? 참 : 거짓 ;
		// 변수 = (조건식) ? 값1 : 값2;
		
		MyMath abs3= new MyMath() {

			@Override
			public double calc(double x, double y) {
				
				return (x>y) ? x-y: -(x-y);
			}
			
		};
		System.out.println(abs3.calc(6, 2));
		System.out.println(abs3.calc(2, 6));
		
		System.out.println("--- 람다 삼항연산자 ---");
		
		 MyMath abs4 = (x,y) -> x-y < 0 ? -(x-y) : x-y;
		 System.out.println(abs4.calc(5, 3));
		 System.out.println(abs4.calc(3,5));
		 
		 
		 // 리턴 값이 없는 추상 메서드 구현
		 
		 // 익명 클래스
		 Printable printer1 = new Printable() {
			
			 @Override
			 public void print(String str) {
				 System.out.println("Hello " +str);
			 }
		 };
		 
		 printer1.print("Java, SQL, Spring, JSP, JavaScript");
		 
		 // 람다 표현식
		 Printable printer2 =x ->System.out.println("Hello "+ x); 
		 
		 //Printable printer2 =x ->{System.out.println("Hello "+ x);};  매개변수가 2개이상이면 중괄호를 써줘야 한다.
		 printer2.print("CSS, HTML, AWS");
		 
	}
}
