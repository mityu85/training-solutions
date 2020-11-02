package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        cost = (fund * interestRate) / 100;
        return cost / 365 * days;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public double close(int days) {
        double total = getFund() + getYield(days);
        double payout = active == false ? 0.0 : total - (total * 0.3 / 100);
        active = false;
        return payout;
    }
}
