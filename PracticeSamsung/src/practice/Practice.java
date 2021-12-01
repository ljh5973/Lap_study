package practice;

import java.util.Scanner;

public class Practice {

	
	public static void main(String[] args) {
		
		String text= "안녕 나는 개구리야";
		
		String result=text.replaceAll("[ㄱ-ㅎ가-힣]", "개굴");
		System.out.println(result);
	}
	
	
}
