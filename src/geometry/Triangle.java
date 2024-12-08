package geometry;

public class Triangle extends Geometry2D {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implement calculateArea() for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Implement calculatePerimeter() for Triangle
    @Override
    public double calculatePerimeter() {
        // Assuming equilateral triangle for simplicity
        return 3 * base;  // Modify this if needed for other types of triangles
    }
}
