package edu.java.loop11;

public class LoopMain11 {

	
	public static void main(String[] args) {
		
		
		
		//while문 연습
		
		//1. 구구단 9단 출력
		
		//2. 구구단 1단부터 12단 출력
		
		
		//3. 구구단 1단부터 12단 까지 자신의 단까지만 출력
		int i=9;
		int j=1;
		
		
//		while(j<=9) {
//			System.out.println(i+"x"+j+"="+i*j);
//			j++;
//		}
		
//		i=1;
//		
//		while(i<12) {
//			j=1;
//			i++;
//			while(j<=12) {
//				System.out.println(i+"x"+j+"="+i*j);
//				j++;
//			}
//		}
//		
//		i=0;
//		
//		while(i<12) {
//			
//			j=1;
//			i++;
//					
//			while(j<=i) {
//				System.out.println(i+"x"+j+"="+i*j);
//				j++;
//				
//
//			}
//		
//		}
//		
		i=1;
		
		while(i<=12) {
			j=1;
			while(j<=12) {
				System.out.println(i+"x"+j+"="+i*j);
				if(j==i) {
					
					break;
				}

				j++;
			}
			i++;
		}

	}
}
