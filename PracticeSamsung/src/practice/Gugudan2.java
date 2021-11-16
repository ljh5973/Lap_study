package practice;

import java.util.Arrays;

public class Gugudan2 {

	public static void main(String[] args) {
		
		int[][] arr=new int [8][9];
		
		
		for (int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				arr[i-2][j-1]=i*j;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+2)+"단");
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
