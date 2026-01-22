package Exercises;

public class BookMain {
    public static void main(String[] args) {
        // Using Different Constructors
        Book book1 = new Book("Java Programming", "John Doe", 400, 49.99);
        Book book2 = new Book("Python Basics", "Jane Smith");
        Book book3 = new Book();

        System.out.println(book1.title + " by " + book1.author);
        System.out.println(book2.title + " by " + book2.author);
        System.out.println(book3.title + " by " + book3.author);
    }
}
