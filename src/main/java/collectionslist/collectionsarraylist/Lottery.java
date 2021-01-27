package collectionslist.collectionsarraylist;

import java.util.*;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {

        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }

        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 1; i <= lotteryType; i++) {
            numbers.add(rand.nextInt(ballCount)+1);
        }
        numbers.sort(Comparator.naturalOrder());
        return numbers;
    }
}
