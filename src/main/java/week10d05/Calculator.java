package week10d05;

public class Calculator {

    public StringBuilder findMinMaxSum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int sumMin = 0;
        int max = Integer.MIN_VALUE;
        int[] minSeries = new int[4];
        int[] maxSeries = new int[4];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min) {
                    int temp = min;
                    min = arr[j];
                    arr[j] = temp;
                    minSeries[i] = min;
                }
            }
            sumMin += min;
            min = Integer.MAX_VALUE;
            if (i < 3) {
                sb.append(minSeries[i]);
                sb.append("+");
            } else {
                sb.append(minSeries[i]);
                sb.append("=");
                sb.append(sumMin);
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(new Calculator().findMinMaxSum(arr));
    }
}
