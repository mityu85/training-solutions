package week11d01;

import java.util.ArrayList;
import java.util.List;

public class PairFinder {

    public int findPairs(int[] arr) {
        int temp = 1;
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                }
            }
            pair += temp / 2;
            temp = 1;
        }
        return pair / 2;
    }
}
