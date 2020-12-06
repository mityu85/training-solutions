package week06d03;

import java.util.ArrayList;
import java.util.List;

public class Series {

    public boolean isIncrementalSeries(List<Integer> numbers) {
        if (numbers.isEmpty() || numbers.size() == 1) {
            throw new IllegalArgumentException("Wrong number list");
        }
        int counterIncremental = 0;
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i) < numbers.get(i + 1))
                counterIncremental++;
        }
        return counterIncremental == numbers.size()-1;
    }

    public boolean isDecrementalSeries(List<Integer> numbers) {
        if (numbers.isEmpty() || numbers.size() == 1) {
            throw new IllegalArgumentException("Wrong number list");
        }
        int counterDecremental = 0;
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i) > numbers.get(i + 1))
                counterDecremental++;
        }
        return counterDecremental == numbers.size()-1;
    }

    public String calculateSeriesType(List<Integer> numbers) {
       if (isIncrementalSeries(numbers)) {
           return "Incremental Series";
       }
       if (isDecrementalSeries(numbers)) {
           return "Decremental Series";
       }
       return "Mixed Series";
    }
}
