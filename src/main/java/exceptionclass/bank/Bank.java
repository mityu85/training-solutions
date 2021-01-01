package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException();
        }
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void subtract(Account account, int value) {
        for (Account accountItem: accounts) {
            if (accountItem.getAccountNumber() == account.getAccountNumber()) {
                account.subtract(value);
            } else {
                throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
            }
        }
    }

    public void deposit(Account account, int value) {
        for (Account accountItem: accounts) {
            if (accountItem.getAccountNumber() == account.getAccountNumber()) {
                account.deposit(value);
            } else {
                throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
            }
        }
    }
}
