package week11d01;

public class DivisorFinder {

    public int findDivisors(int n) {
        String number = Integer.toString(n);
        int length = number.length();
        int[] temp = new int[length];
        int divisorCounter = 0;
        int remainder = 0;
        for (int i = 0; i < length; i++) {
            remainder = n % 10;
            n = n / 10;
            temp[i] = remainder;
        }
        for (int i = 0; i < temp.length; i++) {
            if ((Integer.parseInt(number) % temp[i]) == 0) {
                divisorCounter++;
            }
        }
        return divisorCounter;
    }
}
