package algorithmsdecision.bankaccounts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Transaction {

    private String accountNumber;
    private TransactionOperation transactionOperation;
    private TransactionStatus transactionStatus;
    private int amount;
    private LocalDateTime dateOfTransaction;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public boolean isBigger(List<Transaction> transactions, String from, String to, int amount) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime today = LocalDateTime.parse(from, formatter);
        LocalDateTime tomorrow = LocalDateTime.parse(to, formatter);

        for (Transaction transaction: transactions) {
            if (transaction.transactionOperation.equals(TransactionOperation.DEBIT) &&
                    transaction.transactionStatus.equals(TransactionStatus.SUCCEEDED) &&
                    transaction.dateOfTransaction.isAfter(today) &&
                    transaction.dateOfTransaction.isBefore(tomorrow) &&
                    transaction.amount > amount) {
                return true;
            }
        }
        return false;
    }
}
