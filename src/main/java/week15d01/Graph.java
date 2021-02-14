package week15d01;

import java.util.*;

public class Graph {

    private  Map<Integer, Integer> graph = new HashMap<>();

    public int maxValue(Map m) {
        Collection<Integer> a = m.values();
        List<Integer> integers = new ArrayList<>();
        for (Integer i: a) {
            integers.add(i);
        }
        return max(integers);
    }

    private int max(List<Integer> integers) {
        int max = Integer.MIN_VALUE;
        Collections.sort(integers);
        for (Integer i: integers) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
