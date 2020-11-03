package array;

public class ArrayMain {
    public static void main(String[] args) {

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(week[1]);
        System.out.println("The array length is: " + week.length);

        int[] numb = new int[5];
        numb[0] = 1;
        for (int i = 1; i < numb.length; i++) {
            numb[i] = numb[i-1]*2;
           // System.out.println(numb[i]);
        }
        for (int i = 0; i < numb.length; i++) {
            System.out.println(numb[i]);
        }

        System.out.println();

        boolean[] b = new boolean[6];
        for (int i = 0; i < b.length; i += 2) {
            b[i] = false;
        }
        for (int i = 1; i < b.length; i += 2) {
            b[i] = true;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
