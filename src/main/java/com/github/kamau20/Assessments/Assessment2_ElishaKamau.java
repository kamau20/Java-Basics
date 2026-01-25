package com.github.kamau20.Assessments;

public class Assessment2_ElishaKamau {
    public static void main(String[] args) {

        // ASSIGNMENT 2.1: OOP CONCEPTS QUIZ

        Book {} // Quiz Problem 1 (Class Design & Encapsulation)
        // Employee {} // Quiz problem 2 (Inheritance Hierarchy)
        // Calculator {} // Quiz Problem 3 (Overloading & Overriding)
        // BankAccount {} // Quiz Problem 4 (Bank Account Inheritance)

        // Quiz Problem 5 (Conceptual Questions)
        // Calculator {} // 1. Difference between Method Overloading & Method Overriding
        // BankAccountGood {} // 2. Why Fields should be declared private in a class
        // Vehicle {} // 3. When you should use the "Super" keyword
        // 4. Purpose of the @Override annotation
        // 5. How encapsulation improves code maintainability

    }

    // SOLUTIONS FOR ASSIGNMENT 2.1: OOP CONCEPTS

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
    public class Employee {
        // Private fields
        private String name;
        private String id;
        private double salary;

        // Constructor with parameters
        public Employee(String name, String id, double salary) {
            setName(name);
            setId(id);
            setSalary(salary);
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public double getSalary() {
            return salary;
        }

        // Setters with validation
        public void setName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            this.name = name;
        }

        public void setId(String id) {
            if (id == null || id.trim().isEmpty()) {
                throw new IllegalArgumentException("Employee ID cannot be null or empty");
            }
            this.id = id;
        }

        public void setSalary(double salary) {
            if (salary < 0) {
                throw new IllegalArgumentException("Salary cannot be negative");
            }
            this.salary = salary;
        }

        // Calculate bonus method (5% of salary)
        public double calculateBonus() {
            return salary * 0.05;
        }

        // Display info method
        public void displayInfo() {
            System.out.println("Employee Information:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: $" + String.format("%.2f", salary));
            System.out.println("Bonus: $" + String.format("%.2f", calculateBonus()));
        }
    }
    //Manager Class
    public class Manager extends Employee {
        private String department;

        // Constructor using super to call parent constructor
        public Manager(String name, String id, double salary, String department) {
            super(name, id, salary); // Call parent constructor
            setDepartment(department);
        }

        // Getter
        public String getDepartment() {
            return department;
        }

        // Setter with validation
        public void setDepartment(String department) {
            if (department == null || department.trim().isEmpty()) {
                throw new IllegalArgumentException("Department cannot be null or empty");
            }
            this.department = department;
        }

        // Override calculateBonus - Managers get 15% bonus
        @Override
        public double calculateBonus() {
            return getSalary() * 0.15;
        }

        // Override displayInfo using super to call parent method
        @Override
        public void displayInfo() {
            super.displayInfo(); // Call parent's displayInfo first
            System.out.println("Department: " + department);
            System.out.println("Manager Bonus (15%): $" + String.format("%.2f", calculateBonus()));
        }
    }
    // Developer Class
    public class Developer extends Employee {
        private String programmingLanguage;

        // Constructor using super to call parent constructor
        public Developer(String name, String id, double salary, String programmingLanguage) {
            super(name, id, salary); // Call parent constructor
            setProgrammingLanguage(programmingLanguage);
        }

        // Getter
        public String getProgrammingLanguage() {
            return programmingLanguage;
        }

        // Setter with validation
        public void setProgrammingLanguage(String programmingLanguage) {
            if (programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
                throw new IllegalArgumentException("Programming language cannot be null or empty");
            }
            this.programmingLanguage = programmingLanguage;
        }

        // Override calculateBonus - Developers get 10% bonus
        @Override
        public double calculateBonus() {
            return getSalary() * 0.10;
        }

        // Override displayInfo using super to call parent method
        @Override
        public void displayInfo() {
            super.displayInfo(); // Call parent's displayInfo first
            System.out.println("Programming Language: " + programmingLanguage);
            System.out.println("Developer Bonus (10%): $" + String.format("%.2f", calculateBonus()));
        }
    }

    // Solution for Quiz Problem 3 (Overloading & Overriding)
    public class Calculator {

        // Method Overloading - same method name, different parameters

        // 1. Add two integers
        public int add(int a, int b) {
            return a + b;
        }

        // 2. Add two doubles
        public double add(double a, double b) {
            return a + b;
        }

        // 3. Add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // 4. Add (concatenate) two strings
        public String add(String a, String b) {
            return a + b;
        }

        // Additional overloaded methods for demonstration
        public int subtract(int a, int b) {
            return a - b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }

        // Display calculator info
        public void displayInfo() {
            System.out.println("This is a basic Calculator");
        }
    }
    // ScientificCalculator that Extends Calculator
    public class ScientificCalculator extends Calculator {

        // Method Overriding - same signature as parent, different implementation

        // Override add(int a, int b) to include a log message
        @Override
        public int add(int a, int b) {
            System.out.println("[LOG] Adding two integers: " + a + " + " + b);
            return super.add(a, b); // Call parent's implementation using super
        }

        // Override displayInfo
        @Override
        public void displayInfo() {
            System.out.println("This is a Scientific Calculator with advanced features");
        }

        // New methods specific to ScientificCalculator

        // Calculate power (base^exponent)
        public double power(double base, double exponent) {
            System.out.println("[LOG] Calculating " + base + "^" + exponent);
            return Math.pow(base, exponent);
        }

        // Calculate square root
        public double squareRoot(double num) {
            if (num < 0) {
                throw new ArithmeticException("Cannot calculate square root of negative number");
            }
            System.out.println("[LOG] Calculating square root of " + num);
            return Math.sqrt(num);
        }

        // Additional scientific methods
        public double sine(double angleInDegrees) {
            System.out.println("[LOG] Calculating sine of " + angleInDegrees + " degrees");
            return Math.sin(Math.toRadians(angleInDegrees));
        }

        public double cosine(double angleInDegrees) {
            System.out.println("[LOG] Calculating cosine of " + angleInDegrees + " degrees");
            return Math.cos(Math.toRadians(angleInDegrees));
        }

        public double logarithm(double num) {
            if (num <= 0) {
                throw new ArithmeticException("Logarithm undefined for non-positive numbers");
            }
            System.out.println("[LOG] Calculating natural log of " + num);
            return Math.log(num);
        }
    }

    // Solution for Quiz Problem 4 (Bank Account Inheritance)
    public class BankAccount {
        // Private fields
        private String accountNumber;
        private String accountHolder;
        private double balance;

        // Constructor with validation
        public BankAccount(String accountNumber, String accountHolder, double balance) {
            setAccountNumber(accountNumber);
            setAccountHolder(accountHolder);
            setBalance(balance);
        }

        // Getters
        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        // Setters with validation
        public void setAccountNumber(String accountNumber) {
            if (accountNumber == null || accountNumber.trim().isEmpty()) {
                throw new IllegalArgumentException("Account number cannot be null or empty");
            }
            this.accountNumber = accountNumber;
        }

        public void setAccountHolder(String accountHolder) {
            if (accountHolder == null || accountHolder.trim().isEmpty()) {
                throw new IllegalArgumentException("Account holder name cannot be null or empty");
            }
            this.accountHolder = accountHolder;
        }

        protected void setBalance(double balance) {
            if (balance < 0) {
                throw new IllegalArgumentException("Balance cannot be negative");
            }
            this.balance = balance;
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
            balance += amount;
            System.out.println("Deposited: $" + String.format("%.2f", amount));
            System.out.println("New Balance: $" + String.format("%.2f", balance));
        }

        // Withdraw method
        public boolean withdraw(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }

            if (amount > balance) {
                System.out.println("Insufficient funds. Withdrawal failed.");
                return false;
            }

            balance -= amount;
            System.out.println("Withdrawn: $" + String.format("%.2f", amount));
            System.out.println("New Balance: $" + String.format("%.2f", balance));
            return true;
        }

        // Display account information
        public void displayAccountInfo() {
            System.out.println("Account Type: Basic Account");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: $" + String.format("%.2f", balance));
        }
    }
    // Savings Account Class
    public class SavingsAccount extends BankAccount {
        private double interestRate;
        private static final double MINIMUM_BALANCE = 100.00;

        // Constructor
        public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
            super(accountNumber, accountHolder, balance);
            setInterestRate(interestRate);

            // Validate initial balance meets minimum requirement
            if (balance < MINIMUM_BALANCE) {
                throw new IllegalArgumentException("Savings account requires minimum balance of $" + MINIMUM_BALANCE);
            }
        }

        // Getter and Setter for interest rate
        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            if (interestRate < 0 || interestRate > 100) {
                throw new IllegalArgumentException("Interest rate must be between 0 and 100");
            }
            this.interestRate = interestRate;
        }

        // Override withdraw to maintain minimum balance
        @Override
        public boolean withdraw(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }

            double newBalance = getBalance() - amount;

            if (newBalance < MINIMUM_BALANCE) {
                System.out.println("Withdrawal failed: Must maintain minimum balance of $" +
                        String.format("%.2f", MINIMUM_BALANCE));
                System.out.println("Current Balance: $" + String.format("%.2f", getBalance()));
                System.out.println("Requested Withdrawal: $" + String.format("%.2f", amount));
                System.out.println("Maximum withdrawal allowed: $" +
                        String.format("%.2f", getBalance() - MINIMUM_BALANCE));
                return false;
            }

            return super.withdraw(amount); // Call parent's withdraw method
        }

        // Apply interest to the account
        public void applyInterest() {
            double interest = getBalance() * (interestRate / 100);
            System.out.println("Applying " + interestRate + "% interest...");
            System.out.println("Interest earned: $" + String.format("%.2f", interest));
            deposit(interest);
        }

        // Override displayAccountInfo
        @Override
        public void displayAccountInfo() {
            System.out.println("Account Type: Savings Account");
            System.out.println("Account Number: " + getAccountNumber());
            System.out.println("Account Holder: " + getAccountHolder());
            System.out.println("Balance: $" + String.format("%.2f", getBalance()));
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Minimum Balance Required: $" + String.format("%.2f", MINIMUM_BALANCE));
        }
    }
    // CheckingAccount Class
    public class CheckingAccount extends BankAccount {
        private double overdraftLimit;

        // Constructor
        public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
            super(accountNumber, accountHolder, balance);
            setOverdraftLimit(overdraftLimit);
        }

        // Getter and Setter for overdraft limit
        public double getOverdraftLimit() {
            return overdraftLimit;
        }

        public void setOverdraftLimit(double overdraftLimit) {
            if (overdraftLimit < 0) {
                throw new IllegalArgumentException("Overdraft limit cannot be negative");
            }
            this.overdraftLimit = overdraftLimit;
        }

        // Get available balance (including overdraft)
        public double getAvailableBalance() {
            return getBalance() + overdraftLimit;
        }

        // Override withdraw to allow overdraft
        @Override
        public boolean withdraw(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }

            double availableBalance = getBalance() + overdraftLimit;

            if (amount > availableBalance) {
                System.out.println("Withdrawal failed: Exceeds overdraft limit");
                System.out.println("Current Balance: $" + String.format("%.2f", getBalance()));
                System.out.println("Overdraft Limit: $" + String.format("%.2f", overdraftLimit));
                System.out.println("Available Balance: $" + String.format("%.2f", availableBalance));
                System.out.println("Requested Amount: $" + String.format("%.2f", amount));
                return false;
            }

            // Use reflection to access protected setBalance since we need to allow negative balance
            double newBalance = getBalance() - amount;

            // We need to bypass the parent's validation, so we'll manually update
            try {
                java.lang.reflect.Field balanceField = BankAccount.class.getDeclaredField("balance");
                balanceField.setAccessible(true);
                balanceField.set(this, newBalance);

                System.out.println("Withdrawn: $" + String.format("%.2f", amount));
                System.out.println("New Balance: $" + String.format("%.2f", newBalance));

                if (newBalance < 0) {
                    System.out.println("WARNING: Account overdrawn by $" + String.format("%.2f", Math.abs(newBalance)));
                }

                return true;
            } catch (Exception e) {
                System.out.println("Error processing withdrawal");
                return false;
            }
        }

        // Override displayAccountInfo
        @Override
        public void displayAccountInfo() {
            System.out.println("Account Type: Checking Account");
            System.out.println("Account Number: " + getAccountNumber());
            System.out.println("Account Holder: " + getAccountHolder());
            System.out.println("Balance: $" + String.format("%.2f", getBalance()));
            System.out.println("Overdraft Limit: $" + String.format("%.2f", overdraftLimit));
            System.out.println("Available Balance: $" + String.format("%.2f", getAvailableBalance()));

            if (getBalance() < 0) {
                System.out.println("STATUS: OVERDRAWN by $" + String.format("%.2f", Math.abs(getBalance())));
            }
        }
    }

    // Solution for Quiz Problem 5.1 Difference between Method Overloading & Method Overriding
    // ===== METHOD OVERLOADING EXAMPLE =====
    // Same class, same method name, different parameters

    class Calculator {

        // Method 1: Add two integers
        public int add(int a, int b) {
            System.out.println("Adding two integers");
            return a + b;
        }

        // Method 2: Add three integers
        public int add(int a, int b, int c) {
            System.out.println("Adding three integers");
            return a + b + c;
        }

        // Method 3: Add two doubles
        public double add(double a, double b) {
            System.out.println("Adding two doubles");
            return a + b;
        }
    }

    // ===== METHOD OVERRIDING EXAMPLE =====
    // Parent and child class, same method signature, different implementation

    class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }

        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    class Dog extends Animal {
        // Override: Same method signature as parent
        @Override
        public void makeSound() {
            System.out.println("Dog barks: Woof! Woof!");
        }
    }

    class Cat extends Animal {
        // Override: Same method signature as parent
        @Override
        public void makeSound() {
            System.out.println("Cat meows: Meow! Meow!");
        }
    }

    // Solution for Quiz problem 5.2 Why Fields should be declared private in a class
    // ===== BAD EXAMPLE: Public Fields =====

    class BankAccountBad {
        public String accountHolder;
        public double balance;  // Anyone can modify this!

        public BankAccountBad(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
    }
    // ===== GOOD EXAMPLE: Private Fields =====

    class BankAccountGood {
        private String accountHolder;
        private double balance;  // Protected from direct access

        public BankAccountGood(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        // Controlled access through methods
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }

        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
                return true;
            } else {
                System.out.println("Invalid withdrawal - insufficient funds or invalid amount");
                return false;
            }
        }

        public double getBalance() {
            return balance;
        }

        public String getAccountHolder() {
            return accountHolder;
        }
    }

    // Solution for Quiz Problem 5.3 When you should use the "Super" keyword
    // ===== PARENT CLASS =====

    class Vehicle {
        private String brand;
        private int year;

        // Constructor
        public Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
            System.out.println("Vehicle constructor called");
        }

        // Method to display info
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Year: " + year);
        }

        // Method to start
        public void start() {
            System.out.println("Vehicle is starting...");
        }

        // Getters
        public String getBrand() {
            return brand;
        }

        public int getYear() {
            return year;
        }
    }
    // ===== CHILD CLASS =====

    class Car extends Vehicle {
        private int numDoors;

        // USE 1: super() to call parent constructor
        public Car(String brand, int year, int numDoors) {
            super(brand, year);  // MUST be first line - calls Vehicle constructor
            this.numDoors = numDoors;
            System.out.println("Car constructor called");
        }

        // USE 2: super.method() to call parent method
        @Override
        public void start() {
            super.start();  // Call parent's start() method first
            System.out.println("Car engine roaring...");
            System.out.println("Ready to drive!");
        }

        // USE 3: super.method() to extend parent method
        @Override
        public void displayInfo() {
            super.displayInfo();  // Call parent's displayInfo()
            System.out.println("Number of doors: " + numDoors);  // Add extra info
        }

        // Method that uses parent's fields through getters
        public void showFullInfo() {
            System.out.println("This is a " + super.getBrand() + " car");  // Access parent method
            System.out.println("Manufactured in " + super.getYear());
            System.out.println("It has " + numDoors + " doors");
        }
    }
}
