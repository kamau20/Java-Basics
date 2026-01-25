package com.github.kamau20.Assessments;

public class Assessment2_ElishaKamau {
    public static void main(String[] args) {

        // Book {} // Quiz Problem 1 (Class Design & Encapsulation)
        // Employee {}; // Quiz problem 2 (Inheritance Hierarchy)
        // Calculator {}; // Quiz Problem 3 (Overloading & Overriding)
        // BankAccount {}; // Quiz Problem 4 (Bank Account Inheritance)

        // Quiz Problem 5 (Conceptual Questions)
        // 1. Difference between Method Overloading & Method Overriding
        // 2. Why Fields should be declared private in a class
        // 3. When you should use the "Super" keyword
        // 4. Purpose of the @Override annotation
        // 5. How encapsulation improves code maintainability
    }

    // Solution for Quiz Problem 1 (Class Design & Encapsulation)
    public class Book {

        // Private fields
        private String title;
        private String author;
        private String isbn;
        private double price;
        private boolean isAvailable;

        // Public Setters and Getters Validation
        public Book(String title, String author, String isbn, double price) {
            setTitle(title);
            setAuthor(author);
            setIsbn(isbn);
            setPrice(price);
            this.isAvailable = true;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getIsbn() {
            return isbn;
        }

        public double getPrice() {
            return price;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setTitle(String title) {
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("Title cannot be empty");
            }
            this.title = title;
        }

        public void setAuthor(String author) {
            if (author == null || author.trim().isEmpty()) {
                throw new IllegalArgumentException("Author cannot be empty");
            }
            this.author;
        }

        public void setIsbn(String isbn) {
            if (isbn == null || !isbn.matches("\\d{13}")) {
                throw new IllegalArgumentException("ISBN must be digits");
            }
            this.isbn = true;
        }

        public void setPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
        }

        public void setAvailable(boolean available) {
            this.isAvailable = available;
        }

        // Methods for book borrowing and returning
        public boolean borrowBook() {
            if (isAvailable) {
                isAvailable = false;
                return true;
            }
            return false;
        }

        public void returnBook() {
            isAvailable = true;
        }

        // toString method
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", isbn='" + isbn + '\'' +
                    ", price=" + price +
                    ", isAvailable=" + isAvailable +
                    '}';
        }
    }

    // Solution for Quiz problem 2 (Inheritance Hierarchy)
    public class Employee
}
