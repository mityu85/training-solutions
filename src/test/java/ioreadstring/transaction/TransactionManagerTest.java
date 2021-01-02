package ioreadstring.transaction;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionManagerTest {

    private  TransactionManager tm = new TransactionManager(Path.of("src/main/resources/accounts.txt"),
                                                            Path.of("src/main/resources/transactions.txt"));

    @Test
    public void testUploadAccounts(){
        assertEquals(0,tm.getBankAccounts().size());

        tm.readFromFile();

        assertEquals(5,tm.getBankAccounts().size());
        assertEquals("Jack Doe",tm.getBankAccounts().get(3).getName());
        assertEquals(234050200,tm.getBankAccounts().get(1).getBalance(),0.0000001);

    }

    @Test
    public void makeTransactionsTest(){
        tm.readFromFile();

        tm.executeTransactionFromFile();

        assertEquals(1201000,tm.getBankAccounts().get(0).getBalance(),0.0000001);
        assertEquals(721220,tm.getBankAccounts().get(3).getBalance(),0.00001);

    }
}
