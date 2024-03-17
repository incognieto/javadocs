package Polymorphsm2;

//*********************************************************
// Rectangle.java
//
// Define classes for a rectangle. 
// The Rectangle class are descendants of the Shape class. 
// A rectangle is defined by its length and width and its area is length times width.
// Define the toString method in a way similar to that for the Sphere class.
//*********************************************************

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		super("Rectangle");
		length=l;
		width=w;
	}
	
	public double area() {
		return length*width;
	}
	
	public String toString() {
		return super.toString() + " of length " + length + " and width " + width;
 	}
}
