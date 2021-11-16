package edu.java.loop09;

public class LoopMain09 {

	public static final String  LINE="-----";
	
	public static void main(String[] args) {
		
		//while 반복문
		
		//1부터 5까지 1씩 증가시키면서 출력
		
		
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(LINE);
		// 5부터 1까지 내림차순 출력
		
		int j=5;
		while(j>0) {
			System.out.println(j);
			j--;
		}
		
		int a =1;
		
		while(a<10) {
			
			if(a%2==1) {
				
				System.out.print(a+" ");
			}
			a++;
		}
		System.out.println("\n"+LINE);
		int b= 1;
		while(b<10) {
			System.out.print(b+" ");
			b+=2;
		}
		System.out.println("\n"+LINE);
		
		char ch='a';
		
		while(ch<='z') {
			System.out.print(ch+" ");
			ch++;
		}
		
		
	}
}
