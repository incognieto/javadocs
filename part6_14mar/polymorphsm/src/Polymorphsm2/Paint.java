package Polymorphsm2;

//*********************************************************
// Paint.java
//
// Represents a type of paint that has a fixed area
// covered by a gallon. All measurements are in feet.
//*********************************************************

public class Paint {
	private double coverage;

	//------------------------------------
    // Contructor: Sets up the paint Object
    //------------------------------------
	public Paint(double c) {
		coverage=c;
	}
	
    //------------------------------------
    // Returns the amount of paint (num of gallons)
    // needed to paint the shape given as the paramater
    //------------------------------------
	public double amount(Shape s) {
		System.out.println("Computing amount for " + s);
		return s.area()/coverage;
	}
}
