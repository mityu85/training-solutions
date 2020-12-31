package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b) {
        int temp;
        while(b>0){
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
