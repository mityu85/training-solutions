package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int transactionCounter(List<Transaction> transactions, TransactionType transactionType, int amount) {

        int counter = 0;
        for (Transaction transaction: transactions) {
            if (transaction.getTransactionType() == transactionType && transaction.getAmount() < amount) {
                counter++;
            }
        }
        return counter;
    }
}
