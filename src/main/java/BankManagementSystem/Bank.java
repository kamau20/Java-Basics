package BankManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account added successfully!!!");
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountHolder().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found!!");
        return null;
    }

    public void transferFund(String fromAccountNumber, String toAccountNumber, double amount) {
        BankAccount fromBankAccount = findAccount(fromAccountNumber);
        BankAccount toBankAccount = findAccount(toAccountNumber);

        if (null != fromBankAccount && null != toBankAccount) {
            fromBankAccount.withdraw(amount);
            toBankAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from " + fromAccountNumber + " to " + toAccountNumber);
        }
    }
}
