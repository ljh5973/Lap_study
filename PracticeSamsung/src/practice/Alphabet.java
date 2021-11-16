package practice;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		String S = scan.nextLine();

		
		scan.close();
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}

		}
		for(int result: arr) {
			System.out.print(result+" ");
		}

	}
}
