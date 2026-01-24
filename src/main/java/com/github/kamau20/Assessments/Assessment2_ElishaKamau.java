package com.github.kamau20.Assessments;

public class Assessment2_ElishaKamau {
    public static void main(String[] args) {

        // Book(); // Quiz Problem 1 (Class Design & Encapsulation)
        // Employee(); // Quiz problem 2 (Inheritance Hierarchy)
        // Calculator(); // Quiz Problem 3 (Overloading & Overriding)
        // BankAccount(); // Quiz Problem 4 (Bank Account Inheritance)

        // Quiz Problem 5 (Conceptual Questions)
        // 1. Difference between Method Overloading & Method Overriding
        // 2. Why Fields should be declared private in a class
        // 3. When you should use the "Super" keyword
        // 4. Purpose of the @Override annotation
        // 5. How encapsulation improves code maintainability
    }

    public class Book {
        private String title;
        private String author;
        private String isbn;
        private double price;
        private boolean isAvailable;

        public Book(String bookTitle, String bookAuthor, String bookIsbn, double bookPrice) {
            bookTitle(title);
            bookAuthor(author);
            bookIsbn(isbn);
            bookPrice(price);
            this.isAvailable = true;
        }
    }
}
