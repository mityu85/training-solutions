package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        System.out.println("1" + "2");
        int a = 1;
        int b = 2;
        System.out.println("1" + b);
        System.out.println(a + "2");
        String str = Integer.toString(1) + Integer.toString(2);
        System.out.println(str);

        double quotient = 3.0 / 4.0;
        System.out.println(quotient);

        long big = 3_244_444_444L;

        String s = "árvíztűrőtükörfúrógép";
        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
