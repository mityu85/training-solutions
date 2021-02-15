package exam03;

public enum CruiseClass {

    LUXURY(3.0), FIRST(1.8), SECOND(1.0);

    private double values;

    CruiseClass(double values) {
        this.values = values;
    }

    public double getValues() {
        return values;
    }
}
