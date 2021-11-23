package edu.java.inheritance09;

public class Circle extends Shape{

	//field
	
	private double radius;
	
	// constructor
	public Circle(double radius) {
		super("원");
		this.radius=radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (radius*radius)*Math.PI;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (radius*2)*Math.PI;
	}
}
