package Polymorphsm2;

public abstract class Shape {
    //------------------------------------
    // An instance variable shapeName of type String
    //------------------------------------
	private String shapeName;
	
	public Shape(String name) {
		this.shapeName=name;
	}
	
    //------------------------------------
    // An abstract method area()
    //------------------------------------
	public abstract double area();
	
    //------------------------------------
    // a toString method tha returns the name of the Shape
    //------------------------------------
	public String toString() {
		return shapeName;
	}
}
