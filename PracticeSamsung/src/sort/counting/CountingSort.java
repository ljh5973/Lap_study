package sort.counting;


public class CountingSort {

	public void sort(int [] arr) {
		
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		int temp[]= new int[max+1];
		for(int i=0; i<arr.length; i++) {
			temp[arr[i]]++;
			
		}
		
		
		for(int i=0; i<temp.length-1; i++) {
			temp[i+1]+=temp[i];
		}
		
		int result[]=new int[arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			temp[arr[i]]--;
			result[temp[arr[i]]]=arr[i];
		}
		System.out.print("[");
		
		for(int i=0; i<result.length; i++) {
			if(i>=result.length-1) {
				System.out.print(result[i]);
			}else {
				
				System.out.print(result[i]+",");
			}
		}
		System.out.print("]");
		
	}
}
