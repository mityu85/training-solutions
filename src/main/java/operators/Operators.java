package operators;

public class Operators {

    public boolean isEven(int n) {
        return n % 2 == 0 ? true : false;
    }

    public int multiplyByPowerOfTwo(int a, int b) {
        String s = Integer.toBinaryString(a << b);
        return Integer.parseInt(s, 2);
    }
}
