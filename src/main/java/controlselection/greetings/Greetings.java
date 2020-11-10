package controlselection.greetings;

public class Greetings {

    private int h;
    private int m;

    public String greeting(int h, int m) {
        if (h > 5 && h < 9) {
            return "Good morning!";
        } else {
            if ((h >= 9 && h < 18) || (h == 18 && m <= 30)) {
                return "Good day!";
                } else {
                    if ((h == 18 && m > 30) || (h > 18 && h < 20)) {
                        return "Good evening!";
                    } else {
                        return "Good night!";
                }
            }
        }
    }

    public static void main(String[] args) {

        Greetings greetings = new Greetings();
        System.out.println(greetings.greeting(9, 50));
        System.out.println(greetings.greeting(18, 20));
        System.out.println(greetings.greeting(18, 31));
        System.out.println(greetings.greeting(20, 31));
        System.out.println(greetings.greeting(4, 59));
    }
}
