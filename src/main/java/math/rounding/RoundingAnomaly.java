package math.rounding;

import java.util.Random;

public class RoundingAnomaly {

    public double[] randomNumbers(int size, double max, int scale) {
        double d = Math.pow(10, scale);
        double rnd = Math.round(new Random().nextDouble() * max * d) / d;
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = rnd;
        }
        return array;
    }

    public double roundAfterSum(double[] numbers) {
        double sum = 0;
        for (double item: numbers) {
            sum += item;
        }
        return Math.round(sum);
    }

    public double sumAfterRound(double[] numbers) {
        double sum = 0;
        for (double item : numbers) {
            sum += Math.round(item);
        }
        return sum;
    }

    public double difference(int size, double max, int scale) {
        double[] numbers = randomNumbers(size, max, scale);
        double resultAfterSum = roundAfterSum(numbers);
        double resultAfterRound = sumAfterRound(numbers);
        return Math.abs(resultAfterSum - resultAfterRound);
    }

    public static void main(String[] args) {
        RoundingAnomaly roundingAnomaly = new RoundingAnomaly();
        int count = 100;
        double sum = 0;
        for (int i = 0; i < count; i++) {
            double diff = roundingAnomaly.difference(1000, 1_000_000, 5);
            sum += diff;
            System.out.println("Diff: " + diff);
        }
        System.out.println(sum / count);
    }
}
