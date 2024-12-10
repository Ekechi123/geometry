package geometry;

/**
 * Abstract class for representing 2D geometric shapes.
 * All 2D shapes should extend this class and implement the calculateArea and calculatePerimeter methods.
 */
public abstract class Geometry2D {

    /**
     * Abstract method to calculate the area of the shape.
     * 
     * @return The area of the shape.
     */
    public abstract double calculateArea();

    /**
     * Abstract method to calculate the perimeter of the shape.
     * 
     * @return The perimeter of the shape.
     */
    public abstract double calculatePerimeter();
}
