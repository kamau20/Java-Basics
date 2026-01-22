package Exercises;

public class Circle {
    public double radius;
    public double circumference;
    public double pi;

    public Circle() {
        this.radius = 5.5;
        this.circumference = 7.2;
        this.pi = 3.14;
    }

    public Circle(double radius, double circumference, double pi) {
        this.radius = radius;
        this.circumference = circumference;
        this.pi = pi;
    }

    public double calculateArea() {
        return this.radius * this.circumference / this.pi;
    }

    public void displayInfo() {
        System.out.println("Area: " + this.calculateArea());
    }
}
