package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        System.out.println(new Operators().isEven(19));

        String e = Integer.toBinaryString(16 << 1);
        String f = Integer.toBinaryString(16 >> 1);
        System.out.println(Integer.parseInt(e, 2));
        System.out.println(Integer.parseInt(f, 2));

       /* String s = Integer.toBinaryString(13 << 1);
        String f = Integer.toBinaryString(13 >> 1);
        System.out.println(Integer.parseInt(s, 2));
        System.out.println(Integer.parseInt(f, 2));*/

        System.out.println(new Operators().multiplyByPowerOfTwo(10, 3));

        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        int j = Long.valueOf(s, 2).intValue();
        System.out.println(j);

        System.out.println(0333);
    }
}
