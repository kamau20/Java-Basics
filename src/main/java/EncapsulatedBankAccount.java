public class EncapsulatedBankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public EncapsulatedBankAccount(String accountNumber, String accountHolder, double initialBalance) {
        setAccountNumber(accountNumber); // Use setters in constructor
        setAccountHolder(accountHolder);
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    // Getter and Setter for accountNumber with validation
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.matches("\\d{5,10}")) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Error: Account number must be 5-10 digits");
        }
    }

    // Getter and Setter for accountHolder with validation
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && accountHolder.trim().length() >=2) {

        }
    }
}
