package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain am = new ArraysMain();

        System.out.println(am.numberOfDaysAsString());

        System.out.println(am.daysOfWeek());

        System.out.println(am.multiplicationTableAsString(5));

        double[] a = {12, 18, 26, 12.6, 15.7};
        double[] b = {12, 18, 26, 15.7, 12.6};
        System.out.println(am.sameTempValues(a, b));

        int[] c = {12, 18, 26, 12, 15};
        int[] d = {12, 18, 26, 15, 12};
        System.out.println(am.wonLottery(c, d));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        int[] e = {12, 18, 26, 12, 15};
        int[] f = {12, 18, 26, 15, 12};
        System.out.println(am.wonLottery2(e, f));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));

        double[] g = {12, 18, 26, 12.6, 15.7, 12, 18, 26, 12.6, 15.7};
        double[] h = {12, 18, 26, 12.6, 15.7, 12, 18, 26};
        System.out.println(am.sameTempValuesDaylight(g, h));
    }

    public String numberOfDaysAsString() {
        int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(array);
    }

    public List<String> daysOfWeek() {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return Arrays.asList(week);
    }

    public String multiplicationTableAsString(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(array);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public boolean wonLottery2(int[] a, int[] b) {
        int[] aTemp = Arrays.copyOf(a, a.length);
        int[] bTemp = Arrays.copyOf(b, b.length);
        Arrays.sort(aTemp);
        Arrays.sort(bTemp);
        return Arrays.equals(aTemp, bTemp);
    }

    public int min(int a, int b){
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int min = min(day.length, anotherDay.length);
        double[] dayTemp = Arrays.copyOfRange(day, 0, min);
        double[] anotherDayTemp = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(dayTemp, anotherDay);
    }
}
