package edu.java.modifier01;

public class AccessTest {

	
	//field
	
	private int privateField;
	int packageField;
	protected int protectedField;
	public int publicField;
	
	public void printAllFields() {
		System.out.println("private: "+ privateField);
		System.out.println("package: "+ packageField);
		System.out.println("protected: " + protectedField);
		System.out.println("public: "+ publicField);
	}
}
