package Exercises;

public class Rectangle {
    public double width;
    public double height;

    // Default Constructor
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with dimensions
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor for square
    public Rectangle(double size) {
        this.width = size;
        this.height = size;
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    public boolean isSquare() {
        return this.width == this.height;
    }

    public void displayInfo() {
        System.out.println("Rectangle: " + this.width + "x" + this.height);
        System.out.println("Area: " + this.calculateArea());
        System.out.println("Perimeter: " + this.calculatePerimeter());
        System.out.println("Is square: " + this.isSquare());
    }
}
