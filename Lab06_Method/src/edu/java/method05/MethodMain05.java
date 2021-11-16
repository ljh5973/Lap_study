package edu.java.method05;

public class MethodMain05 {

	public static void main(String[] args) {
		
		//메서드 작성 연습
		
		int [] scores= {10,20,100,90,80};
		
		
		
		int total= sum(scores);	//정수 배열을 sum 메서드의 argument로 전달, 호출
		double averageNum=average(scores);
		int maxNum= max(scores);
		int minNum= min(scores);
		double stdNum= std(scores);
		
		System.out.println("총점은 "+total+"점 입니다.");
		System.out.println("평균은 "+ averageNum+"점 입니다.");
		System.out.println("최댓값은 "+maxNum+"점 입니다.");
		System.out.println("최솟값은 "+minNum+"점 입니다.");
		System.out.printf("%s %5f %s", "표준편차는",stdNum,"입니다.\n");
		System.out.println("표준편차는 "+stdNum+"점 입니다.");
		//TODO: 과제
		// 평균 계산하는 메서드 호출, 그 결과 출력
		// 표준편차 계산하는 메서드 호출, 그 결과 출력
		// 최댓값 찾는 메서드 호출, 그 결과 출력
		// 최솟값 찾는 메서드 호출, 그 결과 출력
		// 모든 메서드의 파라미터 타입은 int[].
	}
	
	public static int sum(int[] scores) {
		
		int sum=0;
		for(int i=0; i<scores.length;i++) {
			sum+=scores[i];
		}
		
		return sum;
	}
	
	public static double average(int [] scores) {
		
		double sum=0;
		for(double num: scores) {
			sum+=num;
		}
		
		sum/=scores.length;
		return sum;
	}
	
	public static int max(int [] scores) {
		int max=scores[0];
		
		for(int num: scores) {
			if(max<num) {
				max=num;
			}
		}
		return max;
	}
	
	public static int min(int[] scores) {
		int min= scores[0];
		
		for(int num:scores) {
			if(min>num) {
				min=num;
			}
		}
		return min;
	}
	
	public static double std(int[] scores) {
		// 평균 구하기
		double avg= average(scores);
		
		double sum=0;
		
		
		for(int i=0; i<scores.length; i++) {
			
			// 각 값에 평균값을 하나씩 빼주고 제곱해주기
			scores[i]-=avg;
			scores[i]*=scores[i];
			
			// 제곱한 값들 전부를 sum변수에 저장
			sum+=scores[i];
		}
		// sum을 자료의 갯수만큼 나눔
		sum/=scores.length;
		
		// 나눈 수의 제곱근을 구함
		double result=Math.sqrt(sum);
		
		return result;
		
	}
}
