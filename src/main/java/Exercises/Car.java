package Exercises;

public class Car {
    public String brand;
    public String model;
    public int year;
    public double price;
    public void startEngine() {
        System.out.println(brand + " " + model + " engine started!");
    }

    public void displayDetails() {
        System.out.println(year + " " + brand + " - $" + price);
    }
}
