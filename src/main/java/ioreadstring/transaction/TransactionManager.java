package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private Path pathOfAccounts;
    private Path pathOfTransactions;
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public TransactionManager(Path pathOfAccounts, Path pathOfTransactions) {
        this.pathOfAccounts = pathOfAccounts;
        this.pathOfTransactions = pathOfTransactions;
    }

    public Path getPathOfAccounts() {
        return pathOfAccounts;
    }

    public Path getPathOfTransactions() {
        return pathOfTransactions;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void readFromFile() {
        try {
            List<String> contents = Files.readAllLines(pathOfAccounts);
            for (String content: contents) {
                String[] accountDetails = content.split(";");
                BankAccount bankAccount = new BankAccount(accountDetails[0], accountDetails[1], Double.parseDouble(accountDetails[2]));
                bankAccounts.add(bankAccount);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }
    }

    public void executeTransactionFromFile() {
        try {
            List<String> contents = Files.readAllLines(pathOfTransactions);
            for (String content: contents) {
                String[] transactionDetails = content.split(";");
                for (BankAccount bankAccount: bankAccounts) {
                    if (transactionDetails[0].equals(bankAccount.getAccountNumber())) {
                        bankAccount.deposit(Double.parseDouble(transactionDetails[1]));
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }
    }
}
