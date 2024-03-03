/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
   // private instance variables, not accessible from outside this class
   private double radius;
   private String color;

   // Constructors (overloaded)

   /** Constructs a Circle instance with default values for radius and color */
   public Circle() { // 1st (default) constructor
       radius = 1.0;
       color = "red";
   }

   /**
    * Constructs a Circle instance with the given radius and default color.
    * 
    * @param r The radius of the circle.
    */
   public Circle(double r) { // 2nd constructor
       radius = r;
       color = "red";
   }

   /**
    * Constructs a Circle instance with the given radius and color.
    * 
    * @param radius The radius of the circle.
    * @param color  The color of the circle.
    */
   public Circle(double radius, String color) {
       this.radius = radius;
       this.color = color;
   }

   /** Returns the radius */
   public double getRadius() {
       return radius;
   }

   /** Returns the color */
   public String getColor() {
       return color;
   }

   /**
    * Sets the radius of the circle.
    * 
    * @param radius The new radius value.
    */
   public void setRadius(double radius) {
       this.radius = radius;
   }

   /**
    * Sets the color of the circle.
    * 
    * @param color The new color value.
    */
   public void setColor(String color) {
       this.color = color;
   }

   /** Returns the area of this Circle instance */
   public double getArea() {
       return radius * radius * Math.PI;
   }

   /**
    * Return a self-descriptive string of this instance in the form of
    * Circle[radius=?,color=?]
    */
   public String toString() {
       return "Circle[radius=" + radius + " color=" + color + "]";
   }
}
