package practice;

public class StringNum {

	public static void main(String[] args) {

		int a = 0;
		String s="one4seveneight";
		

		String[]num = {"1","2","3","4","5","6","7","8","9"};
		String []str = {"one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i=0; i<10; i++) {
			s=s.replace(str[i], num[i]);
		}
		
	}
}
