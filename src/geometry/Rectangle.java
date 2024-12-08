package geometry;

public class Rectangle extends Geometry2D {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the area() method for Rectangle
    @Override
    public double area() {
        return length * width;
    }

    // Getter and setter methods (optional but useful for testing and future extensions)
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
