package edu.java.class06;

public class MainClass {

	public static void main(String[] args) {

		Account p1 = new Account(123456, 10000);
		Account p2 = new Account(789456, 5000);
		System.out.println(Messages.getString("MainClass.0") + p1.deposit(2000)); //$NON-NLS-1$
		p1.info();

		p1.widthDraw(4_000);
		p1.info();
		p1.transfer(p2, 2000);

		p2.info();

		p2.transfer(p1, 6000);
		p2.info();
		
		System.out.println(Messages.getString("MainClass.1")); //$NON-NLS-1$
		
	}
}
