package practice;

import java.util.Scanner;

public class Test {
 
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		
		
		int T= scan.nextInt();
		
		for(int i=0; i<T; i++) {
			int b=scan.nextInt();
			
			int c=b/3;
			System.out.print("#"+(i+1)+ " "+ c+"\n");
		}
	}
}
