package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccount {

    private String nameOfOwner;
    private String accountNumber;
    private int balance;

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
