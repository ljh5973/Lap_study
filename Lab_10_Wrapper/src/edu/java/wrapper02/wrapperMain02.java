package edu.java.wrapper02;

import java.math.BigDecimal;
import java.math.BigInteger;

public class wrapperMain02 {

	
	public static void main(String[] args) {
		
		// BigInteger, BigDecimal
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		// 기본 타입의 범위(최솟값 ~ 최댓값)을 넘어서는 숫자들은 변수에 할당할 수 없음.
//		long longNumber=9000000000000000000L; long 타입의 범위를 넘어서는 숫자(리터럴)을 만들 수도 없음.
		
		// wrapper 클래스는 java.lang 패키지에 포함되어 있어서 import 문 없이 사용 가능하지만,
		// BigInteger, BigDecimal 클래스는 java.math 패키지에 포함되어 있기 때문에 import문을 사용해야 함.
		// 생성자를 호출할 때 보통 문자열을 파라미터에 전달함.
		// 이유는 자바가 만들어 낼 수 있는 범위를 넘어서는 숫자를 만들어 내기 위해서.
		BigInteger big1= new BigInteger("10");
		System.out.println();
		
		double d1 = 1.1;
		double d2= 0.9;
		
		System.out.println(d1+d2);
		System.out.println(d1-d2);
		
		// BigDecimal : 아주 큰 실수를 저장할 수 있고, 오차를 자바의 double 타입의 오차보다 훨씬 작게 줄여줌.
		BigDecimal x= new BigDecimal("1.1");
		BigDecimal y= new BigDecimal("0.9");
		
		System.out.println(x.add(y));
		System.out.println(x.subtract(y));
		

		
		
		
		
	}
}
