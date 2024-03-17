package Polymorphsm2;

//*********************************************************
// Cylinder.java
//
// Define similar classes for  a cylinder. 
// The Cylinder class are descendants of the Shape class. 
// A cylinder is defined by a radius and height and its area (surface area) is PI*radius^2*height. 
// Define the toString method in a way similar to that for the Sphere class.
//*********************************************************

public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public Cylinder(double r, double h) {
		super("Cylinder");
		radius=r;
		height=h;
	}
	
	public double area() {
		return Math.PI*radius*radius*height;
	}
	
	public String toString() {
		return super.toString() + " of radius " + radius + " and height " + height;
 	}
}
