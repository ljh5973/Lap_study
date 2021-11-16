package edu.java.class03;

public class MainClass {

	public static void main(String[] args) {
		
		Rectangle rec1= new Rectangle();
		Rectangle rec2= new Rectangle(5);
		Rectangle rec3= new Rectangle(5, 2);
		
		
		
		System.out.println("rec1의 넓이는 = "+rec1.area());
		System.out.println("rec1의 둘레는 = "+rec1.round());
		
		System.out.println("\nrec2의 넓이는 = "+rec2.area());
		System.out.println("rec2의 둘레는 = "+rec2.round());
		
		System.out.println("\nrec3의 넓이는 = "+rec3.area());
		System.out.println("rec3의 둘레는 = "+rec3.round());
		
		
	}
}
