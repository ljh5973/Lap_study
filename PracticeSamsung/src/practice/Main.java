package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		

		Scanner scan= new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		

		for(int i=0; i<10; i++) {
			list.add(scan.nextInt()%42);
			
		}
		Set<Integer> length=new HashSet<>(list);
		
		System.out.println(length.size());
		
		
		
		
		
		
	}
}