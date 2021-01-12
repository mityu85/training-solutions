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
        if (maxSubtract < 0) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double value) {
        if (value > maxSubtract || value < 0) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        if (value > balance) {
            throw new InvalidBankOperationException(ErrorCode.LOW_BALANCE);
        }
        return balance -= value;
    }

    public double deposit(double value) {
        if (value < 0) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        return balance += value;
    }
}
