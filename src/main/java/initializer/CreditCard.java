package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private long balance;
    private Currency currency;

    private static final List<Rate> RATES = new ArrayList<>();

    public CreditCard(long balance, Currency currency, List<Rate> upload) {
        RATES.addAll(upload);
        this.balance = (long) (balance * getConversationFactor(currency));
        this.currency = currency;
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getConversationFactor(Currency currency) {
        for (Rate rate: RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;
    }

    public boolean payment(long amount, Currency currency) {
        if (balance >= amount * getConversationFactor(currency)) {
            balance -= amount * getConversationFactor(currency);
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }
}
