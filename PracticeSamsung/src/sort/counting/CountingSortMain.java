package sort.counting;


public class CountingSortMain {

	
	public static void main(String[] args) {
		
		
		CountingSort c1= new CountingSort();
		
//		int arr[]= {0,4,1,3,1,2,4,1};
		int arr[]= {1,2,3,1,2,3};
		
		c1.sort(arr);
	}
}
