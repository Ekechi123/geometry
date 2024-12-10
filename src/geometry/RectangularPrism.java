package geometry;

public class RectangularPrism extends Geometry3D {
    private double length;
    private double width;
    private double height;

    public RectangularPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double volume() {
        return length * width * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * width + length * height + height * width);
    }

    @Override
    public String toString() {
        return String.format("RectangularPrism [Length: %.2f, Width: %.2f, Height: %.2f]", length, width, height);
    }
}
