package practice;


public class Pascal {

	public static void main(String[] args) {
		
		//크기를 정해줌
		int [][]arr=new int[10][];
		
		for( int i=0; i<arr.length; i++) {
			//arr[0]부터 1~length까지 크기를 하나씩 넣어줌
			//ex arr[0].length ==1 arr[1].length ==2;
			
			// 하나씩 크기가 커지는 규칙있는 2차원 배열을 선언해준 것
			arr[i]=new int[i+1];
		}
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<i; j++) {
				arr[i][j]=1;
				
				
				// 높이(i)가 1보다 크고 넓이(j)가 1이상이면서
				// 넓이가 높이-1보다 작을경우(i가4이면 j=0,1,2)
				// 높이가 한 칸 위에 있는 숫자를 가지고 밑에 숫자를 출력하기위함임
				if(i>1&&j>=1&&j<i-1) {
					// arr[i-1][j-1]은 지금 나의 왼쪽위에있는 숫자 
					// arr[i-1][j]는 지금 내위에 있는 숫자 를 더해서 arr[i][j]에 넣어준다.
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
				
				//	출력
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
