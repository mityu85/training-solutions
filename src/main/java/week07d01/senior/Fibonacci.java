package week07d01.senior;

public class Fibonacci {

    public long fib(int n) {
        long fibNumber = 0;
        switch (n) {
            case 0:
                fibNumber = 0;
                break;
            case 1:
                fibNumber = 1;
                break;
            default:
                fibNumber = n - 1 + n - 2;
        }
        return fibNumber;
    }
}
