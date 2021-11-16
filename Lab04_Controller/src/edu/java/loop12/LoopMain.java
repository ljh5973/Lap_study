package edu.java.loop12;

import java.util.Arrays;

public class LoopMain {

	public static void main(String[] args) {
		
		
		/*
		 * for 문 while문 둘다 작성
		 * 1.아래와 같이 출력되도록 코드 작성
		 * (출력결과)
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		
//		for(int i=0; i<5; i++) {
//			System.out.println();
//			for(int j=0; j<=i; j++) {
//			
//				System.out.print("*");
//			}
//		}
		
//		int i=0;
//		int j=0;
//		while(i<5) {
//			System.out.println();
//			i++;
//			j=0;
//			while(j<i) {
//				System.out.print("*");
//				j++;
//			}
//		}
		
		//삼각형 역으로 그리기
		
//		for(int i=0; i<10; i++) {
//			for(int j=9; j>0; j--) {
//				if(i<j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		//피라미드 그리기
		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<3-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<2*i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// 마름모 그리기

		/*
		 * 2. 아래와 같이 출력되도록 코드 작성
		 * 1꼬마 2꼬마 3꼬마 인디언
		 * 4꼬마 5꼬마 6꼬마 인디언
		 * 7꼬마 8꼬마 9꼬마 인디언
		 * 10꼬마 인디언 소년 
		 */
		
		
//		for(int i=1; i<=10; i++) {
//			System.out.print(i+"꼬마 ");
//			if(i%3==0) {
//				System.out.print("인디언");
//				System.out.println();
//			}
//
//		}
//				System.out.println("인디언 소년");
//		
//		int i=1;
//		while(i<=10) {
//			System.out.print(i+"꼬마 ");
//			if(i%3==0) {
//				System.out.print("인디언");
//				System.out.println();
//			}
//			if(i==10) {
//				System.out.println("인디언 소년");
//			}
//			i++;
//		}
		
		/*
		 * 3. 369게임 출력
		 * 	(출력 결과)
		 * 1 2 * 4 5 * 7 8 * 10
		 * 11 12 * 14 15 * 17 18 * 20
		 * 21 22 * 24 25 2* 27 28 * *
		 * 
		 * ...
		 * 100
		 */
		
		
//		int n=100;
		
//		for(int i=1; i<=n; i++) {
//			int cnt=0;
//			
//			//10 미만일 때 처리
			//해도되고 안해도 된다.
//			if(i<10) {
//				
//				if(i%3==0) {
//					System.out.print("* ");
//				}else System.out.print(i+" ");
//				
//			}
//			//10 이상일 떄 숫자를 String str로 형변환 해주고 split으로 자름
//			else {
//				
//				String str=Integer.toString(i);
//				String []num=str.split("");
//				
//				// 배열에 3, 6, 9 가 들어가 있으면 cnt를 증가
//				for(int j=0; j<num.length;j++) {
//					if(num[j].contains("3")||num[j].contains("6")||num[j].contains("9")) {
//						cnt++;
//					}
//				}
//				
//				// cnt가 0이면 i를 출력 cnt가 있으면 *를 출력
//				if(cnt==0) {
//					System.out.print(i+" ");
//				}else {
//					for(int j=0; j<cnt; j++) {
//						System.out.print("*");
//					}
//					System.out.print(" ");
//					
//				}
//				
//			}
//			if(i%10==0) {
//				System.out.println();
//			}
//		}
		int n=100;
		int i=1;
		while(i<=n) {
			int cnt=0;
			//10 미만은 처리를 해줘도 되고 안해줘도 된다.
			if(i<10) {
				if(i%3==0) {
					System.out.print("* ");
				}else System.out.print(i+" ");
			}
			else {
				String str=Integer.toString(i);
				String []num=str.split("");
				
				for(int j=0; j<num.length;j++) {
					if(num[j].contains("3")||num[j].contains("6")||num[j].contains("9")) {
						cnt++;
					}
				}
				
				if(cnt==0) {
					System.out.print(i+" ");
				}else {
					for(int j=0; j<cnt; j++) {
						System.out.print("*");
						
					}
					System.out.print(" ");
				}
			}
			if(i%10==0) {
				System.out.println();
			}
			i++;
		}
	}
}
