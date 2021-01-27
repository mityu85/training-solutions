package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) {

        if (maxNumber <= drawCount) {
            throw new IllegalArgumentException("drawCount must be less then " + maxNumber + "!");
        }

        List<Integer> numbers = new LinkedList<>();
        Random rand = new Random();
        for (int i = 1; i <= drawCount; i++) {
            numbers.add(rand.nextInt(drawCount)+1);
        }
        return new TreeSet<>(numbers);
    }
}
