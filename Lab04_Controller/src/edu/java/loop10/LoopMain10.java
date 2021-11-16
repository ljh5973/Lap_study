package edu.java.loop10;

import java.util.Arrays;

public class LoopMain10 {

	
	public static void main(String[] args) {
		
		// while과 do while 비교
		
		int n=1;	//초기화 문장
		
		do {
			System.out.print(n+" ");	//실행문
			
			n++;						//변수 값 변경
			
		}while(n<1);					//반복 조건 심사
		
		
		int a='A';
		int b='a';
		
		
		String aa="HelloWorld";
		
		String arr[]=aa.split(aa);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
