package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Small {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int n= scan.nextInt();
		
		int x=2;
		int answer=0;
		while(true) {
			if(n%x==1) {
				answer=x;
				break;
			}
			x++;
		}
	}
}
