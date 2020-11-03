package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {

        IntroControl ic = new IntroControl();
        int a = ic.substractTenIfGreaterThanTen(12);
        System.out.println(a);
        a = ic.substractTenIfGreaterThanTen(9);
        System.out.println(a);

        ic.printOddNumbers(29);
        System.out.println(ic);
    }
}
