package Exercises;

public class Student {
    // Instance variables - properties each student will have
    public String name;
    public int age;
    public double gpa;

    // Method - Behaviour students can perfomr
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}
