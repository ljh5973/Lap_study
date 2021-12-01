package practice;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		

		int snail[][]=new int[5][5];
		
		int draw=5;
		int n=1;
		int right=-1;
		int bottom=0;
		int top=1;
		
		for(int i=5; i>0; i--) {
			
			for(int j=0; j<draw; j++) {
				right+=top;
				snail[bottom][right]+=n;
				n++;
			}
			
			draw--;
			
			for(int j=0; j<draw; j++) {
				bottom+=top;
				snail[bottom][right]+=n;
				n++;
			}
			top*=-1;
		}
		
		for(int i=0; i<snail.length; i++) {
			for(int j=0; j<snail[i].length; j++) {
				System.out.printf("%2d  ",snail[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
