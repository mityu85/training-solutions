package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countAccount(List<BankAccount> bankAccounts, int amount) {

        int count = 0;
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getBalance() > amount) {
                count++;
            }
        }
        return count;
    }
}
