package geometry;

public class Circle extends Geometry2D {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea() for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement calculatePerimeter() for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
