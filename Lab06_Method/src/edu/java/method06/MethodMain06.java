package edu.java.method06;

public class MethodMain06 {

	public static void main(String[] args) {
		// main 메서드 : JRE(Java Runtime Enviornment)이 프로그램을 실행할 때 가장 먼저 호출하는 메서드.
		// main 메서드의 파라미터 args: JRE가 프로그램에게 전달하는 값들(arguments)
		// Eclipse 메뉴-> Run -> Run Configurations -> Arguments 탭 -> Program arguments 
		// -> 값들을 띄어쓰기로 구별
		
		System.out.println("arguments 개수 : " + args.length);
		System.out.println(args.toString());
		System.out.println(args.hashCode());
		
		args= new String[10];
		args[0]="1";
		System.out.println(args[0]);
	}
}
