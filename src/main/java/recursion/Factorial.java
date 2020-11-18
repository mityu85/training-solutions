package recursion;

public class Factorial {

    public long factorialCounter(int n) {

        if (n > 1) {
            return n * factorialCounter(n - 1);
        }
        return 1;
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        System.out.println(factorial.factorialCounter(5));
    }
}
