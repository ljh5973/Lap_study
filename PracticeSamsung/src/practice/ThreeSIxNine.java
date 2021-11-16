package practice;

import java.util.Scanner;

public class ThreeSIxNine {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		int N=scan.nextInt();
	
		
		// 반복문을 돌린다.
		for(int i=1; i<=N; i++) {
			int cnt=0;
			
			// 10 이하일 때 처리해 준다.
			if(i<10) {
				if(i%3==0)System.out.print("- ");
				else System.out.print(i+" ");
			}
			//10 이상일 땐 숫자를 String str로 형변환 해주고 split으로 하나씩 나누어준다.
			else {
				String str=Integer.toString(i);
				String[] num=str.split("");
				
				//배열에 3이나 6 이나 9 가 들어가있으면 카운트를 올려준다.
				for(int j=0; j<num.length;j++) {
					if(num[j].contains("3")||num[j].contains("6")||num[j].contains("9")) {
						cnt++;
					}
				}
				
				// 카운트가 0이면 그냥 i를 출력해주고 cnt가있는만큼 -를 출력해준다.
				if(cnt==0)System.out.print(i+" ");
				else {for(int j=0; j<cnt; j++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}
	}
}
}