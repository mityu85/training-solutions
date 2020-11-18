package algorithmsum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {

        int sum = 0;
        for (Transaction transaction: transactions) {
            if (transaction.getTransactionOperation().equals("CREDIT")) {
                sum += transaction.getAmount();
            }
        }
        return sum;
    }
}
