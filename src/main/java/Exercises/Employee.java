package Exercises;

public class Employee {
    // Instance variables - available throughout the class
    public String name;
    public double salary;

    public void calculateBonus(double bonusRate) {
        // Local variable - only exists in this method
        double bonus = salary * bonusRate;

        if (bonus > 1000) {
            // Block-level variable - only exists in this block
            String message = "Great bonus!";
            System.out.println(message);
        }

        // System.out.println(message); // Error - out of scope
        System.out.println("Bonus: $" + bonus);
    }

    public void printInfo() {
        // System.out.println(bonus); // Error - bonus doesn't exist here
        System.out.println("Name: " + name);
    }
}
