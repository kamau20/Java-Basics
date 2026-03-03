import Exercises.Student;

import javax.swing.*;

public class GenericClassDemo {
    public static void main(String[] args) {
        // Box for String
        Box<String> stringBox = new Box<>("Hello generics!");
        String content = stringBox.getContent(); // No Casting needed
        System.out.println(stringBox);

        // Box for Integer
        Box<Integer> integerBox = new Box<>(42);
        int number = integerBox.getContent(); // Auto-unboxing
        System.out.println(integerBox);

        // Box for custom objects
        Box<Student> studentBox = new Box<>(new Student("Kamau", 20));
        Student student = studentBox.getContent();
        System.out.println(studentBox);
    }
}
