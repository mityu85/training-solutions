package algorithms.bankaccounts;

import algorithmscount.bankaccounts.Transaction;
import algorithmscount.bankaccounts.TransactionCounter;
import algorithmscount.bankaccounts.TransactionType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionCounterTest {

    @Test
    public void testTransactionCounter() {

        TransactionCounter tc = new TransactionCounter();
        List<Transaction> transactions = new ArrayList<>(Arrays.asList(
                new Transaction("10785647-00000000-98765432", TransactionType.CREDIT, 125000),
                new Transaction("10785647-00000000-98765432", TransactionType.DEBIT, 50000),
                new Transaction("10785647-00000000-98765432", TransactionType.DEBIT, 150000),
                new Transaction("10785647-00000000-98765432", TransactionType.CREDIT, 250000)
        ));

        assertEquals(1, tc.transactionCounter(transactions, TransactionType.CREDIT, 250000));
        assertEquals(2, tc.transactionCounter(transactions, TransactionType.DEBIT, 250000));
    }
}
