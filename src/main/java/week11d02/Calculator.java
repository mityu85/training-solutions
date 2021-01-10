package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> numbers = new ArrayList<>();

    private void collectDatas(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                min = arr[i];
                numbers.add(min);
            }
        }
    }

    public String findMinSum(int[] arr) {
        collectDatas(arr);
        String s = "";
        int sum = 0;
        if (numbers.size() >= 4) {
            for (int i = 0; i < numbers.size(); i++) {
                s += "+" + numbers.get(i);
                sum += numbers.get(i);
            }
            s += "=" + sum;
        }
        return s.substring(1);
    }
}
