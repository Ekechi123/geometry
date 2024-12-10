package geometry;

/**
 * Represents a 2D Circle shape.
 * Inherits from Geometry2D.
 */
public class Circle extends Geometry2D {
    private double radius;

    /**
     * Constructor for creating a Circle with a specified radius.
     * 
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * 
     * @return The area of the circle.
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     * 
     * @return The perimeter (circumference) of the circle.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
