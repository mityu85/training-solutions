package week09d02;

public class FibCalculator {

    public long sumEvens(int bound) {
        long fibNumber = 0;
        for (int i = 0; i <= bound; i++) {
            if (i % 2 == 0) {
                if (i == 0) {
                    fibNumber += 0;
                } else {
                    fibNumber += (i-1 + i-2);
                }
            }
        }
        return fibNumber;
    }
}
