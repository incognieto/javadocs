//import Circle;

package shapetest;

public class testShape {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape1 = new Shape();
        System.out.println("Shape 1:\n" + toString(shape1) + "\n"); // Output: A Shape with color of green and filled

        Shape shape2 = new Shape("blue", false);
        System.out.println("Shape 2:\n" + toString(shape2) + "\n"); // Output: A Shape with color of blue and Not filled

        // Test Circle class
        Circle circle1 = new Circle();
        System.out.println("Circle 1:\n" + toString(circle1) + "\n"); // Output: A Circle with radius=1.0, which is a subclass of A Shape with color of green and filled

        Circle circle2 = new Circle(2.5, "red", true);
        System.out.println("Circle 2:\n" + toString(circle2) + "\n"); // Output: A Circle with radius=2.5, which is a subclass of A Shape with color of red and filled

        // Test Rectangle class
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1:\n" + toString(rectangle1) + "\n"); // Output: A Rectangle with width=1.0 and length=1.0, which is a subclass of A Shape with color of green and filled

        Rectangle rectangle2 = new Rectangle(3.0, 4.0, "yellow", false);
        System.out.println("Rectangle 2:\n" + toString(rectangle2) + "\n"); // Output: A Rectangle with width=3.0 and length=4.0, which is a subclass of A Shape with color of yellow and Not filled

        // Test Square class
        Square square1 = new Square();
        System.out.println("Square 1:\n" + toString(square1) + "\n"); // Output: A Square with side=1.0, which is a subclass of A Rectangle with width=1.0 and length=1.0, which is a subclass of A Shape with color of green and filled

        Square square2 = new Square(5.0, "purple", true);
        System.out.println("Square 2:\n" + toString(square2) + "\n"); // Output: A Square with side=5.0, which is a subclass of A Rectangle with width=5.0 and length=5.0, which is a subclass of A Shape with color of purple and filled
    }

    // Additional toString method for easier output in the main method
    public static String toString(Shape shape) {
        return "Shape : " + "Color = " + shape.getColor() + " Filled = " + shape.isFilled() + "\n" + shape.toString();
    }

    public static String toString(Circle circle) {
        return "Circle : " + "Radius = " + circle.getRadius() + "\n" + circle.toString();
    }

    public static String toString(Rectangle rectangle) {
        return "Rectangle : " + "Width = " + rectangle.getWidth() + " Length = " + rectangle.getLength() + "\n" + rectangle.toString();
    }

    public static String toString(Square square) {
        return "Square : " + "Side = " + square.getWidth() + "\n" + square.toString();
    }
}