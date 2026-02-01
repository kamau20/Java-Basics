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

    // SOLUTION FOR PROBLEM 1 (LibraryItem)
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
    }
}
