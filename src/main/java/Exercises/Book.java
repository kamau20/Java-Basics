package Exercises;

public class Book {
    public String title;
    public String author;
    public int pages;
    public double price;

    // Constructor 1: Full Details
    public Book(String bookTitle, String bookAuthor, int bookPages, double bookPrice) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        price = bookPrice;
    }

    //Constructor 2: Title and Author Only
    public Book(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
        pages = 0; // Default value
        price = 0.0; // Default value
    }

    // Constructor 3: No parameters (Default)
    public Book() {
        title = "The River Between";
        author = "Kenyan Author";
        pages = 0;
        price = 0.0;
    }
}
