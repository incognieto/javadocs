package shapetest;
// Square class

public class Square extends Rectangle {
    // constructor
    public Square() {
        // super() is implicitly called, setting both width and length to 1.0
    }

    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // override toString method
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }

    // override setWidth and setLength to maintain square geometry
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
}

