package com.github.kamau20.Assessments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BankManagementSystem {
    public static void main(String[] args) {
        // ASSIGNMENT 2.2: BANK MANAGEMENT SYSTEM BY ELISHA KAMAU
    }

    // Base BankAccount Class
    public class BankAccount {
        private String accountNumber;
        private String accountHolder;
        protected double balance; // Protected for child class access

        // Constructors, getters, setters with validation
        // deposit(),withdraw(), toString() methods
        public BankAccount(String accountNumber, String accountHolder, double balance) {
            setAccountNumber(accountNumber);
            setAccountHolder(accountHolder);
            setBalance(balance);
        }

        // Getters with proper encapsulation
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
            System.out.println("✓ Deposited: $" + String.format("%.2f", amount));
            System.out.println("  New Balance: $" + String.format("%.2f", balance));
        }

        // Withdraw method
        public boolean withdraw(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }

            if (amount > balance) {
                System.out.println("✗ Withdrawal failed: Insufficient funds");
                System.out.println("  Requested: $" + String.format("%.2f", amount));
                System.out.println("  Available: $" + String.format("%.2f", balance));
                return false;
            }

            balance -= amount;
            System.out.println("✓ Withdrawn: $" + String.format("%.2f", amount));
            System.out.println("  New Balance: $" + String.format("%.2f", balance));
            return true;
        }

        // toString method
        @Override
        public String toString() {
            return "BankAccount{" +
                    "accountNumber='" + accountNumber + '\'' +
                    ", accountHolder='" + accountHolder + '\'' +
                    ", balance=$" + String.format("%.2f", balance) +
                    '}';
        }

    // Specialized Account Classes
    public class SavingsAccount extends BankAccount {
        private double interestRate;
        private static final double MIN_BALANCE = 100.0;

        // Constructor using super()
        // Override withdraw() to check minimum balance
        // applyInterest() method
    }
    public class CheckingAccount extends BankAccount {
        private double overdraftLimit;

        // Constructor using super()
        // Override withdraw() to allow overdraft

    }

    //Bank Management Class
    public class Bank {
        private List<BankAccount> accounts;
        public Bank() {
            accounts = new ArrayList<>();
        }
        public void addAccount(BankAccount) {
            // Check for duplicate account numbers
            accounts.add(account);
        }
        public BankAccount findAccount(String accountNumber) {
            // Search and return account
        }
        public void displayAccounts() {
            // Use polymorphism -different toString() for each account type
            for (BankAccount account : accounts) {
                System.out.println(account.toString());
            }
        }
        // Custom exceptions
        public class InsufficientFundsException extends Exception {
            public InsufficientFundsException(String message) {
                super(message);
            }
        }
        public class InvalidAmountException extends Exception {
            public InvalidAmountException(String message) {
                super(message);
            }
        }
    }

}
