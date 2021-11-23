package edu.java.inheritance09;

public class Rectangle extends Shape{

	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		super("사각형");
		this.width=width;
		this.height=height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}
	
	
	
}
