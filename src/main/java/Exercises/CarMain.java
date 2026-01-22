package Exercises;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Merc";
        car1.model = "E350";
        car1.year = 2025;
        car1.price = 25000;

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "X5";
        car2.year = 2025;
        car2.price = 23000;

        car1.startEngine();
        car2.displayDetails();
    }
}
