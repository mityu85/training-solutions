package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public int maxCalculator(List<Integer> integers) {

        int maxValue = Integer.MIN_VALUE;
        for (Integer integer: integers) {
            if (maxValue < integer) {
                maxValue = integer;
            }
        }
        return maxValue;
    }
}
