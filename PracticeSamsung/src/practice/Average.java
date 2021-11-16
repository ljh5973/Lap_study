package practice;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int T= scan.nextInt();
		
		for( int i=1; i<T; i++) {
			
			int []arr = new int [10];
			int sum=0;
			
			
			for(int j=0; i<arr.length; i++) {
				arr[j]=scan.nextInt();
				sum+=arr[j];
			}
			
			double avg=(double) sum/10;
			System.out.println(avg);
		}
		scan.close();
	}
}
