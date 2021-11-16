package practice;

import java.util.Scanner;

public class SpellStudy {

	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		
		int []arr= new int[26];
		
		String str=scan.next();
		
		for(int i=0; i< str.length(); i++) {
			if('A'<=str.charAt(i)&&str.charAt(i)<='Z') {
				arr[str.charAt(i)-'A']++;
			}else {
				
				arr[str.charAt(i)-'a']++;
			}
			System.out.println(arr[i]);
		}
		
		
		
		int max=-1;
		char ch='?';
		
		for(int i=0; i<26; i++) {
			if(arr[i]> max) {
				max=arr[i];
				ch=(char)(i+65);
			}else if(arr[i]==max) {
				ch='?';
			}
		}
		System.out.println(ch);
	}
}
