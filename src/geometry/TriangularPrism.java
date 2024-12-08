package geometry;

public class TriangularPrism extends Geometry3D {
    private double base;
    private double height;
    private double length;

    // Constructor
    public TriangularPrism(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }

    // Implement volume() for TriangularPrism
    @Override
    public double volume() {
        return 0.5 * base * height * length;
    }

    // Implement surfaceArea() for TriangularPrism
    @Override
    public double surfaceArea() {
        // Assume an equilateral triangle base for simplicity
        double side = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return (2 * base * height) + (3 * side * length);
    }

    // Override toString() to print details of the TriangularPrism
    @Override
    public String toString() {
        return String.format("TriangularPrism [Base: %.2f, Height: %.2f, Length: %.2f]", base, height, length);
    }
}
