package Inheritance;

// Parent Class
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age:" + age);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

// Child Class
public class Student extends Person {
        private String studentId;
        private double gpa;

        public Student(String name, int age, String studentId, double gpa) {
            super(name, age); // Call parent constructor
            this.studentId = studentId;
            this.gpa = gpa;
        }

        public void study() {
            System.out.println(getName() + " is studying....");
        }

}
}
