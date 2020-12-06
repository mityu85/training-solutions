package staticattrmeth.bank;

import java.math.BigDecimal;

public class BankTransaction {

    private static final long MIN = 1;
    private static final long MAX = 10_000_000;
    private static long trxsCounter;
    private static BigDecimal sumOfTrxs = new BigDecimal(0);
    private static long currentMinValue = MAX;
    private static long currentMaxValue = MIN;

    private long trxValue;

    public BankTransaction(long trxValue) {
        if (trxValue < MIN || trxValue > MAX) {
            throw new IllegalArgumentException("Value must be between 1 and 10 000 000!");
        }
        trxsCounter++;
        sumOfTrxs = sumOfTrxs.add(new BigDecimal(trxValue));
        if (trxValue < currentMinValue) {
            currentMinValue = trxValue;
        }
        if (trxValue > currentMaxValue) {
            currentMaxValue = trxValue;
        }
        this.trxValue = trxValue;
    }

    public long getTrxValue() {
        return trxValue;
    }

    public static void initTheDay() {
        trxsCounter = 0;
        sumOfTrxs = new BigDecimal(0);
        currentMaxValue = MIN;
        currentMinValue = MAX;
    }

    public static BigDecimal averageOfTransaction() {
        return trxsCounter == 0 ?  new BigDecimal(0) : sumOfTrxs.divide(new BigDecimal(trxsCounter));
    }

    public static long getCurrentMinValue() {
        return trxsCounter == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return trxsCounter == 0 ? 0 : currentMaxValue;
    }
    public static BigDecimal getSumOfTrxs() {
        return sumOfTrxs;
    }
}
