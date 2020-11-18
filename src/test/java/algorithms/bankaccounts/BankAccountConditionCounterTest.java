package algorithms.bankaccounts;

import algorithmscount.bankaccounts.BankAccount;
import algorithmscount.bankaccounts.BankAccountConditionCounter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountConditionCounterTest {

    @Test
    public void testBankAccountCounter() {

        BankAccountConditionCounter bankAccountConditionCounter = new BankAccountConditionCounter();
        List<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(
                new BankAccount("John Doe", "10756897-78945612-00000000", 5_000_000),
                new BankAccount("Jane Doe", "10756897-00000000-78945612", 12_000_000),
                new BankAccount("Jack Doe", "10756897-00000000-12345678", 2_000_000)
        ));

        assertEquals(2, bankAccountConditionCounter.countAccount(bankAccounts, 2_000_000));
    }
}
