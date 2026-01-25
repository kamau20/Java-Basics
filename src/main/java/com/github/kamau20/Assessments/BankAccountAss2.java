package com.github.kamau20.Assessments;

public class BankAccountAss2 {
    private String accountNumber;
    private String accountHolder;
    protected double balance; // Protected for Child Class

    // Constructors
    public BankAccountAss2(String number, String holder) {
        accountNumber = number;
        accountHolder = holder;
        balance = 0.0;
    }
}
