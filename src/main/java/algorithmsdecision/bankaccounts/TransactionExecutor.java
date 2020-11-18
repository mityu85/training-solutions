package algorithmsdecision.bankaccounts;

import java.util.List;

public class TransactionExecutor {

    public void transactionExecutor(List<BankAccount> bankAccounts, List<Transaction> transactions) {

        for (BankAccount bankAccount: bankAccounts) {
            for (Transaction transaction: transactions) {
                if (bankAccount.getAccountNumber().equals(transaction.getAccountNumber())) {
                    bankAccount.deposit(transaction.getAmount());
                    bankAccount.withdraw(transaction.getAmount());
                }
            }
        }
    }

}
