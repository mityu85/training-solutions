package week07d03;

import java.util.List;

public class NumberList {

    public static boolean isIncreasing(List<Integer> numbers) {
        if (numbers.isEmpty() || numbers.size() == 1) {
            throw new IllegalArgumentException("Wrong number list");
        }
        int counterIncremental = 0;
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i) < numbers.get(i + 1) || numbers.get(i) == numbers.get(i + 1))
                counterIncremental++;
        }
        return counterIncremental == numbers.size()-1;
    }
}
