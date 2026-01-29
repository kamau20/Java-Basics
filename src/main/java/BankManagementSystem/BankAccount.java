package BankManagementSystem;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        super();
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}
