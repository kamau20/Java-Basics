package Exercises;

public class StudentMain {
    public static void main(String[] args) {
        // Create Student Objects
        Student student1 = new Student();
        Student student2 = new Student();

        //Set data for each object
        student1.name = "Salome";
        student1.age = 20;
        student1.gpa = 3.5;

        student2.name = "Kamau";
        student2.age = 30;
        student2.gpa = 4.4;

        // Use Object Methods
        student1.displayInfo();
        student2.displayInfo();
    }
}
