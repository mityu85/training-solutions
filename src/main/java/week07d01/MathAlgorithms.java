package week07d01;

public class MathAlgorithms {

    public static boolean isPrime(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("The given number must greater then 0!");
        }
        if (x == 2) {
            return true;
        }
        return x % 1 == 0 && x % x == 0 && x % 2 == 1;
    }
}
