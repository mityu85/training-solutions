package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccount {

    private String nameOfOwner;
    private String accountNumber;
    private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int value) {
        balance -= value;
    }

    public void deposit(int value) {
        balance += value;
    }

    public boolean isMinimumBalance(List<BankAccount> bankAccounts, int value) {

        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.balance > value) {
                return true;
            }
        }
        return false;
    }
}
