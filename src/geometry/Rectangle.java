package geometry;

/**
 * Represents a 2D Rectangle shape.
 * Inherits from Geometry2D.
 */
public class Rectangle extends Geometry2D {
    private double length;
    private double width;

    /**
     * Constructor for creating a Rectangle with a specified length and width.
     * 
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle.
     * 
     * @return The area of the rectangle.
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * 
     * @return The perimeter of the rectangle.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
