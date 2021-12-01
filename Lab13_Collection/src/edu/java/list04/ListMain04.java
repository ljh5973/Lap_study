package edu.java.list04;

public class ListMain04 {

	public static void main(String[] args) {
		
		Score score1= new Score();
		System.out.println("score1 : "+ score1);
		
		Score score2= new Score(0,0);
		
		System.out.println(score1.equals(score2));
		
		String s1= new String("hello");
		String s2= new String("hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
