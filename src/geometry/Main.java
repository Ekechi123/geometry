package geometry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array with an initial size to store 3D shapes
        Geometry3D[] geometryArray = new Geometry3D[10]; // starting with an array of size 10
        int currentSize = 0; // To keep track of the current number of shapes

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new shape");
            System.out.println("2. View all shapes");
            System.out.println("3. Exit");

            int command = scanner.nextInt();

            if (command == 1) {
                // Ask the user what shape they want to create
                System.out.println("Enter the shape (Sphere, TriangularPrism, RectangularPrism):");
                String shape = scanner.next();

                // Check if array is full and resize it if necessary
                if (currentSize >= geometryArray.length) {
                    // Resize the array to double its size
                    Geometry3D[] newArray = new Geometry3D[geometryArray.length * 2];
                    System.arraycopy(geometryArray, 0, newArray, 0, geometryArray.length);
                    geometryArray = newArray;
                    System.out.println("Array resized to " + geometryArray.length);
                }

                // Create and add the shape based on user input
                if (shape.equalsIgnoreCase("Sphere")) {
                    System.out.println("Enter radius:");
                    double radius = scanner.nextDouble();
                    geometryArray[currentSize] = new Sphere(radius);
                    currentSize++;

                } else if (shape.equalsIgnoreCase("TriangularPrism")) {
                    System.out.println("Enter base, height, and length:");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    double length = scanner.nextDouble();
                    geometryArray[currentSize] = new TriangularPrism(base, height, length);
                    currentSize++;

                } else if (shape.equalsIgnoreCase("RectangularPrism")) {
                    System.out.println("Enter length, width, and height:");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    geometryArray[currentSize] = new RectangularPrism(length, width, height);
                    currentSize++;

                } else {
                    System.out.println("Unknown shape, please try again.");
                }

            } else if (command == 2) {
                // View all the stored shapes
                System.out.println("Stored shapes:");
                for (int i = 0; i < currentSize; i++) {
                    System.out.println(geometryArray[i].toString()); // Assumes `toString()` is overridden in the shape classes
                }

            } else if (command == 3) {
                // Exit the loop
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid command, try again.");
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

