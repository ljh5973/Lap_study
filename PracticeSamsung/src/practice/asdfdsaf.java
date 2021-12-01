package practice;

public class asdfdsaf {

	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		try {
			
			System.out.println(arr[0]);
			System.out.println(arr[5]);
			return;
			
		} catch (Exception e) {
			System.out.println("에러");
		}finally {
			System.out.println("파이널리 실행");
		}
	}
}
