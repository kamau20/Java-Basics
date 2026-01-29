package BankManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Creating Objects
        Bank bank = new Bank();

        SavingsAccount savings =  new SavingsAccount("EK1234", "Elisha Kamau", 5000, 2.5);
        CurrentAccount current = new CurrentAccount("CA456", "Salome Kamau", 3000, 1.5);

        // Adding Accounts into the Bank System
        bank.addAccount(current);
        bank.addAccount(savings);

        savings.deposit(1000);
        current.withdraw(1000);

        savings.addInterest();

        bank.transferFund("CA456", "Salome Kamau", 500);
    }
}
