package practice;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String a = scan.next();

		scan.close();
		int result = 0;
		for (int i = 0; i < N; i++) {
			result += a.charAt(i) - '0';
		}

		System.out.println(result);

	}
}
