package debug.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberStatistics {

    private List<Integer> numbers;

    public NumberStatistics(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumPositives() {
        int sum = 0;
        for(int n: numbers) {
            if(n > 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {
        if (numbers.size() < 2) {
            System.out.print("IllegalStateException ");
            return -1;
        }
        int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for(int i = 1; i < numbers.size() - 1; i++) {
            int actDifference = numbers.get(i) - numbers.get(i + 1);
            if(actDifference < minDifference) {
                if (actDifference < 0) {
                    minDifference = actDifference*(-1);
                } else {
                    minDifference = actDifference;
                }
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        int n1 = new NumberStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3)).sumPositives();
        System.out.println(n1);

        int n2 = new NumberStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3)).minDifferenceBetweenNeighbours();
        System.out.println(n2);

        int n3 = new NumberStatistics(Arrays.asList(-3, -4)).sumPositives();
        System.out.println(n3);

        int n4 = new NumberStatistics(Arrays.asList(1)).minDifferenceBetweenNeighbours();
        System.out.println(n4);
    }
}
