package inheritancemethods.bankaccount;

public class DebitAccount {

    private static final double COST = 3.0;
    private static final long MIN_COST = 200;

    private String accountNumber;
    private long balance;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public final long costOfTransaction(long amount) {
        long transactionFee = (long) (amount * (COST / 100.0));
        return  transactionFee < MIN_COST ? MIN_COST : transactionFee;
    }
    public boolean transaction(long amount) {
        long transaction = amount + costOfTransaction(amount);
        if (transaction <= balance) {
            balance -= transaction;
            return  true;
        }
        return  false;
    }

    public void balanceToZero() {
        balance = 0;// az egyenleget nullázza le, túlköltés esetén
    }
}
