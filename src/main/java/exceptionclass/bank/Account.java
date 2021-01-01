package exceptionclass.bank;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException();
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        maxSubtract = 100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        this.maxSubtract = maxSubtract;
    }

    public void subtract(int value) {
        if (value > maxSubtract) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        if (value > balance) {
            throw new InvalidBankOperationException(ErrorCode.LOW_BALANCE);
        }
        balance -= value;
    }

    public void deposit(int value) {
        balance += value;
    }
}
