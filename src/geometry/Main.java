package geometry;

import java.util.Scanner;

/**
 * Main program to manage and interact with geometric shapes.
 * Provides options to add, view, remove, and find shapes.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Geometry3D> shapesList = new LinkedList<>();
        
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new shape");
            System.out.println("2. View all shapes");
            System.out.println("3. Remove a shape");
            System.out.println("4. Find a shape by name");
            System.out.println("5. Exit");

            int command = scanner.nextInt();

            if (command == 1) {
                // Add a new shape
                System.out.println("Enter the shape (Sphere, TriangularPrism, RectangularPrism):");
                String shape = scanner.next();

                if (shape.equalsIgnoreCase("Sphere")) {
                    System.out.println("Enter radius:");
                    double radius = scanner.nextDouble();
                    shapesList.add(new Sphere(radius));

                } else if (shape.equalsIgnoreCase("TriangularPrism")) {
                    System.out.println("Enter base, height, and length:");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    double length = scanner.nextDouble();
                    shapesList.add(new TriangularPrism(base, height, length));

                } else if (shape.equalsIgnoreCase("RectangularPrism")) {
                    System.out.println("Enter length, width, and height:");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    shapesList.add(new RectangularPrism(length, width, height));

                } else {
                    System.out.println("Unknown shape, please try again.");
                }

            } else if (command == 2) {
                // View all shapes
                System.out.println("Stored shapes:");
                shapesList.print();

            } else if (command == 3) {
                // Remove a shape
                System.out.println("Enter the shape type to remove (e.g., Sphere, TriangularPrism):");
                String shapeToRemove = scanner.next();
                Geometry3D shape = shapesList.find(s -> s.toString().contains(shapeToRemove));
                if (shape != null) {
                    shapesList.remove(shape);
                    System.out.println(shapeToRemove + " has been removed.");
                } else {
                    System.out.println("Shape not found.");
                }

            } else if (command == 4) {
                // Find a shape by name
                System.out.println("Enter the shape name to find (e.g., Sphere, TriangularPrism):");
                String shapeToFind = scanner.next();
                Geometry3D shape = shapesList.find(s -> s.toString().contains(shapeToFind));
                if (shape != null) {
                    System.out.println("Found shape: " + shape);
                } else {
                    System.out.println("Shape not found.");
                }

            } else if (command == 5) {
                // Exit the program
                System.out.println("Exiting program...");
                break;

            } else {
                System.out.println("Invalid command, try again.");
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}


