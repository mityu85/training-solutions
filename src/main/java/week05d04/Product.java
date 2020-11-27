package week05d04;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate expirationDate;
    private long price;
    private Currency currency;

    public Product(String name, int year, int month, int day) {

        this.name = name;
        expirationDate = LocalDate.of(year, month, day);
    }

    public Product(long price, Currency currency) {
            this.price = price;
            this.currency = currency;
        }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public long getPrice() {
        return price;
    }

    public double convertPrice(Currency currency) {
        double value = 0.0;
        if (currency.equals(Currency.HUF) && this.currency.equals(Currency.HUF)) {
            value = price;
        }
        if (currency.equals(Currency.HUF) && this.currency.equals(Currency.USD)) {
            value = price * 300.0;
        }
        if (currency.equals(Currency.USD) && this.currency.equals(Currency.USD)) {
            value = price;
        }
        if (currency.equals(Currency.USD) && this.currency.equals(Currency.HUF)) {
            value = price / 300.0;
        }
        return value;
    }
}
