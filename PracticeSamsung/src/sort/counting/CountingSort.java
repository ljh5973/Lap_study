package sort.counting;

import java.util.Arrays;

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
		
		System.out.print("[");
		
		for(int i=0; i<temp.length; i++) {
			if(i>=temp.length-1) {
				System.out.print(temp[i]);
			}else {
				
				System.out.print(temp[i]+",");
			}
		}
		System.out.print("]");
		
	}
}
