package com.github.kamau20.Assessments;

public class Assessment3_ElishaKamau {
    public static void main(String[] args) {

        // PROBLEM 1
        // LibraryItem {}
        // Book {}
        // DVD {}
        // Magazine {}
        // LibraryTest {}

        // PROBLEM 2
        // BankAccount {}
        // InsufficientFundsException {}
        // InvalidTransactionException {}
        // AccountNotFoundException {}
        // BankTest {}

        // PROBLEM 3
        // Product {}
        // Electronics {}
        // Clothing {}
        // Books {}
        // InvalidProductException {}
        // OutOfStockException {}
        // EcommerceTest {}

        // PROBLEM 4
        // EmploymentManagement {}
        // Analysis_YourName.txt

    }

    // SOLUTION FOR PROBLEM 1
    // BASE CLASS: LibraryItem
    public class LibraryItem {

        // Encapsulation
        private String itemId;
        private String title;
        private String author;
        private boolean isAvailable;

        // Constructor with Validation
        public LibraryItem(String itemId, String title, String author) {
            // Setters
            setItemId(itemId);
            setTitle(title);
            setAuthor(author);
            this.isAvailable = true;
        }

        // Getters
        public String getItemId() {
            return itemId;
        }
        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
        public boolean isAvailable() {
            return isAvailable;
        }

        // Setters with Validation
        public void setItemId(String itemId) {
            if (itemId == null || itemId.trim().isEmpty()) {
                throw new IllegalArgumentException("Item cannot be null or empty");
            }
            this.itemId = itemId;
        }
        public void setTitle(String title) {
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("Title cannot be null or empty");
            }
            this.title = title;
        }
        public void setAuthor(String author) {
            if (author == null || author.trim().isEmpty()) {
                throw new IllegalArgumentException("Author cannot be null or empty");
            }
            this.author = author;
        }
        protected void setAvailable(boolean available) {
            this.isAvailable = available;
        }

        // Checkout method
        public boolean checkout() {
            if (isAvailable) {
                System.out.println("Checkout failed: ");
                System.out.println("Item ID: " + itemId );
                return false;
            }
            isAvailable = false;
            System.out.println("Successfully checked out: " + title);
            System.out.println("Item ID: " + itemId);
            return true;
        }
        // ReturnItem Method
        public boolean returnItem() {
            if (isAvailable) {
                System.out.println("Return failed: Item was not checked out");
                System.out.println("Item ID: " + itemId);
                return false;
            }
            isAvailable = true;
            System.out.println("Successfully returned: " + title);
            System.out.println("Item ID: " + itemId);
            return true;
        }
        // Display Details Method
        public void displayDetails() {
            System.out.println("Item Type: Library Item");
            System.out.println("Item ID: " + itemId);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Status: " + isAvailable);
        }

        // toString Method
        @Override
        public String toString() {
            return "LibraryItem{" +
                    "itemId='" + itemId + '\'' +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", isAvailable=" + isAvailable +
                    '}';
        }
    }

    // CHILD CLASS 1: Book
    public class Book extends LibraryItem {

        // Additional Properties
        private String isbn;
        private String genre;

        // Constructor using super
        public Book(String itemId, String title, String author, String isbn, String genre) {
            super(itemId, title, author);
            setIsbn(isbn);
            setGenre(genre);
        }

        // Getters and Setters
        public String getIsbn() {
            return isbn;
        }
        public void setIsbn(String isbn) {
            if (isbn == null || !isbn.matches("\\d{13}")) {
                throw new IllegalArgumentException("ISBN must be 13 digits ");
            }
            this.isbn =isbn;
        }
        public String getGenre() {
            return genre;
        }
        public void setGenre(String genre) {
            if (genre == null || genre.trim().isEmpty()) {
                throw new IllegalArgumentException("Genre cannot be null or empty");
            }
            this.genre = genre;
        }

        // Override checkout to add book logic
        @Override
        public boolean checkout() {
            System.out.println("Checking out Book...");
            return super.checkout();
        }

        // Override returnItem to add book logic
        @Override
        public boolean returnItem() {
            System.out.println("Returning Book...");
            return super.returnItem();
        }

        // Override displayDetails
        @Override
        public void displayDetails() {
            System.out.println("Book Details");
            super.displayDetails();
            System.out.println("ISBN: " + isbn);
            System.out.println("Genre: " + genre);
            System.out.println("......");
        }

        // Override toString
        @Override
        public String toString() {
            return "Book{" +
                    "itemId='" + getItemId() + '\'' +
                    ", title='" + getTitle() + '\'' +
                    ", author='" + getAuthor() + '\'' +
                    ", isbn='" + isbn + '\'' +
                    ", genre='" + genre + '\'' +
                    ", isAvailable=" + isAvailable() +
                    '}';
        }
    }

    // CHILD CLASS 2: DVD
    public class DVD extends LibraryItem {

        // Additional properties
        private int duration; // in minutes or hourly
        private String rating; // e.g. PG, GA

        // Constructor using super
        public DVD(String itemId, String title, String author, int duration, String rating) {
            super(itemId, title, author);
            setDuration(duration);
            setRating(rating);
        }

        // Getters and Setters
        public int getDuration() {
            return duration;
        }
        public void setDuration(int duration) {
            if (duration <= 0) {
                throw new IllegalArgumentException("Duration must be positive");
            }
            this.duration = duration;
        }

        public String getRating() {
            return rating;
        }
        public void setRating(String rating) {
            if (rating == null || rating.trim().isEmpty()) {
                throw new IllegalArgumentException("Rating cannot be null or empty");
            }
            this.rating = rating;
        }

        // Override checkout to add DDV logic
        @Override
        public boolean checkout() {
            System.out.println("Checking out DVD...");
            if (super.checkout()) {
                System.out.println("Runtime: " + duration + " minutes");
                System.out.println("Rating: " + rating);
                return true;
            }
            return false;
        }

        // Override returnItem to add DVD logic
        @Override
        public boolean returnItem() {
            System.out.println("Returning DVD...");
            return super.returnItem();
        }

        // Override displayDetails
        @Override
        public void displayDetails() {
            System.out.println("DVD Details...");
            super.displayDetails();
            System.out.println("Duration: " + duration + " minutes");
            System.out.println("Rating: " + rating);
            System.out.println("....");
        }

        // Override toString
        @Override
        public String toString() {
            return "DVD{" +
                    "itemId='" + getItemId() + '\'' +
                    ", title='" + getTitle() + '\'' +
                    ", author='" + getAuthor() + '\'' +
                    ", duration=" + duration + " mins" +
                    ", rating='" + rating + '\'' +
                    ", isAvailable=" + isAvailable() +
                    '}';
        }
    }

    // CHILD CLASS 3: Magazine
    public class Magazine extends LibraryItem {

        // Additional Properties
        private int issueNumber;
        private String publicationDate;

        // Constructor using super
        public Magazine(String itemId, String title, String author, int issueNumber, String publicationDate) {
           super(itemId, title, author);
           setissueNumber(issueNumber);
           setPublicationDate(publicationDate);
        }

        // Getters and Setters
        public int getIssueNumber() {
            return issueNumber;
        }
        public void setissueNumber(int issueNumber) {
            if (issueNumber <= 0) {
                throw new IllegalArgumentException("Issue number must be positive");
            }
            this.issueNumber = issueNumber;
        }

        public String getPublicationDate() {
            return publicationDate;
        }
        public void setPublicationDate(String publicationDate) {
            if (publicationDate == null || publicationDate.trim().isEmpty()) {
                throw new IllegalArgumentException("Publication date cannot be null or empty");
            }
            this.publicationDate = publicationDate;
        }

        // Override checkout to add Magazine logic
        @Override
        public boolean checkout() {
            System.out.println("Checking out Magazine...");
            if (super.checkout()) {
                System.out.println("Issue: " + issueNumber);
                System.out.println("Published: " + publicationDate);
                return true;
            }
            return false;
        }

        // Override returnItem to add Magazine
    }
}
