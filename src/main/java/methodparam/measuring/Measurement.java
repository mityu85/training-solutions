package methodparam.measuring;

public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] > lower && values[i] < upper) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {
        Double minDouble = Double.MAX_VALUE;
        for (double value: values) {
            if (value < minDouble) {
                minDouble = value;
            }
        }
        return minDouble;
    }

    public double maximum() {
        Double maxDouble = Double.MIN_VALUE;
        for (double value: values) {
            if (value > maxDouble) {
                maxDouble = value;
            }
        }
        return maxDouble;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }
}
