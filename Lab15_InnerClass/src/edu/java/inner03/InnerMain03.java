package edu.java.inner03;

import edu.java.inner03.EnclosingCls.NestCls;

public class InnerMain03 {

	static class Inner{
		
	}
	int x;
	static int y;
	
	
	public static void main(String[] args) {
		//static 내부 클래스
		
		int a;
//		static int a;	불가능
		
		EnclosingCls.staticMethod();
		System.out.println(EnclosingCls.classVar);
		
		EnclosingCls en=new EnclosingCls(5);
		
		en.printMember();
		en.staticMethod();
		// - > static variable이나 method는 참조 변수로 참조해서 사용이 가능하지만 권장하지 않음.
		
		
		// 중첩 클래스(static 내부 클래스)의 생성자 호출 방법.
		
		EnclosingCls.NestCls nes= new EnclosingCls.NestCls("aa");
		nes.nestedClassmethod();
		NestCls ax =new NestCls("A");
		ax.nestedClassmethod();
	}
	
}
